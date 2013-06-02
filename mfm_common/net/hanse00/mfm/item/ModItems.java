package net.hanse00.mfm.item;

import net.hanse00.mfm.block.ModBlocks;
import net.hanse00.mfm.lib.ItemIds;
import net.hanse00.mfm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * More Foods Mod
 * 
 * ModItems
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModItems {
    // Mod item instances
    public static Item baconRaw;
    public static Item baconCooked;
    public static Item lettuce;
    public static Item lettuceSeeds;
    public static Item tomato;
    public static Item tomatoSeeds;
    public static Item blt;

    public static void init() {
        // Initialize mod items
        baconRaw = new ItemMFMFood(ItemIds.BACON_RAW, 2, 0.2F, true)
                .setUnlocalizedName(Strings.BACON_RAW_NAME);
        baconCooked = new ItemMFMFood(ItemIds.BACON_COOKED, 5, 0.5F, true)
                .setUnlocalizedName(Strings.BACON_COOKED_NAME);
        lettuce = new ItemMFMFood(ItemIds.LETTUCE, 2, 0.2F, false)
                .setUnlocalizedName(Strings.LETTUCE_NAME);
        lettuceSeeds = new ItemMFMSeeds(ItemIds.LETTUCE_SEEDS,
                ModBlocks.lettucePlant.blockID, Block.tilledField.blockID)
                .setUnlocalizedName(Strings.LETTUCE_SEEDS_NAME);
        tomato = new ItemMFMFood(ItemIds.TOMATO, 2, 0.2F, false)
                .setUnlocalizedName(Strings.TOMATO_NAME);
        tomatoSeeds = new ItemMFMSeeds(ItemIds.TOMATO_SEEDS,
                ModBlocks.tomatoPlant.blockID, Block.tilledField.blockID)
                .setUnlocalizedName(Strings.TOMATO_SEEDS_NAME);
        blt = new ItemMFMFood(ItemIds.BLT, 10, 1.0F, false)
                .setUnlocalizedName(Strings.BLT_NAME);

        // Add recipes
        FurnaceRecipes.smelting().addSmelting(baconRaw.itemID,
                new ItemStack(baconCooked), 0.35F);

        GameRegistry.addShapelessRecipe(new ItemStack(blt), new Object[] {
                new ItemStack(baconCooked), new ItemStack(tomato),
                new ItemStack(lettuce), new ItemStack(Item.bread) });

        MinecraftForge.addGrassSeed(new ItemStack(lettuceSeeds), 2);
        MinecraftForge.addGrassSeed(new ItemStack(tomatoSeeds), 2);
    }
}
