package net.hanse00.mfm.block;

import net.hanse00.mfm.item.ModItems;
import net.hanse00.mfm.lib.Reference;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * More Foods Mod
 * 
 * BlockLettucePlant
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockLettucePlant extends BlockCrops {
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public BlockLettucePlant(int par1) {
        super(par1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
        if (par2 < 7) {
            if (par2 == 6) {
                par2 = 5;
            }

            return iconArray[par2 >> 1];
        } else {
            return iconArray[3];
        }
    }

    @Override
    protected int getSeedItem() {
        return ModItems.lettuceSeeds.itemID;
    }

    @Override
    protected int getCropItem() {
        return ModItems.lettuce.itemID;
    }

    @Override
    public int getRenderType() {
        return 1;
    }  

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        iconArray = new Icon[4];

        for (int i = 0; i < iconArray.length; ++i) {
            iconArray[i] = par1IconRegister.registerIcon(Reference.MOD_ID
                    + ":lettucePlant_" + i);
        }
    }
}
