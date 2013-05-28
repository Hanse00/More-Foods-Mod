package net.hanse00.mfm.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.hanse00.mfm.lib.ItemIds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

/**
 * More-Foods-Mod
 * 
 * ModItems
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModItems {
    //Mod item instances
    public static Item rawBacon;
    public static Item cookedBacon;

    public static void init() {
        //Initialize mod items
        rawBacon = new ItemRawBacon(ItemIds.RAW_BACON, 2, 0.2F, true);
        cookedBacon = new ItemCookedBacon(ItemIds.COOKED_BACON, 5, 0.5F, true);
        
        //Register localized names for blocks
        LanguageRegistry.addName(rawBacon, "Raw Bacon");
        LanguageRegistry.addName(cookedBacon, "Cooked Bacon");
        
        FurnaceRecipes.smelting().addSmelting(rawBacon.itemID, new ItemStack(cookedBacon), 0.35F);
    }
}
