package com.jkachele.firstmod.items;
/* @author      Justin Kachele
 * @file        ModItemGroup
 * @created     Tuesday Jun 13, 2023 11:44:15 EDT
*/

import com.jkachele.firstmod.FirstMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup MOD_ITEMS;
    public static RegistryKey<ItemGroup> MOD_ITEMS_KEY;

    public static void registerItemGroups() {
        MOD_ITEMS = FabricItemGroup.builder()
        .icon(() -> new ItemStack(ModItems.TANZANITE))
        .displayName(Text.translatable("Modded Items"))
        .build();

        Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstMod.MOD_ID, "TestGroup"), MOD_ITEMS);

        MOD_ITEMS_KEY = registerKey("TestGroup");
    }

    private static RegistryKey<ItemGroup> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, name));
    }
}

