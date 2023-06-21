package com.jkachele.firstmod.items;
/* @author      Justin Kachele
 * @file        ModItems
 * @created     Tuesday Jun 13, 2023 10:53:38 EDT
*/

import com.jkachele.firstmod.FirstMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void addItemsToGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_TANZANITE);
        addToItemGroup(ItemGroups.INGREDIENTS, TANZANITE);
    }

    public static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group)
            .register(entries -> entries.add(item));
    }

    
    public static void registerModItems() {
        FirstMod.LOGGER.debug("Registering Mod Items for " + FirstMod.MOD_ID);
        addItemsToGroup();
    }
}

