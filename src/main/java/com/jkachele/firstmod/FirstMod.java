package com.jkachele.firstmod;
/* @author      Justin Kachele
 * @file        ModItems
 * @created     Tuesday Jun 13, 2023 10:53:38 EDT
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jkachele.firstmod.items.ModItems;

import net.fabricmc.api.ModInitializer;

public class FirstMod implements ModInitializer {
    public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
    }
}
