package net.hanse00.mfm.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.hanse00.mfm.lib.BlockIds;
import net.hanse00.mfm.lib.Strings;
import net.minecraft.block.Block;

/**
 * More-Foods-Mod
 * 
 * ModBlocks
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModBlocks {
    //Mod block instances
    public static Block lettucePlant;
    
    public static void init() {
        lettucePlant = new BlockLettucePlant(BlockIds.LETTUCE_PLANT).setUnlocalizedName(Strings.LETTUCE_PLANT_NAME);
        
        GameRegistry.registerBlock(lettucePlant, Strings.LETTUCE_PLANT_NAME);
        
        LanguageRegistry.addName(lettucePlant, "Lettuce");
    }
}
