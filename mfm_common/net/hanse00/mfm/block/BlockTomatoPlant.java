package net.hanse00.mfm.block;

import java.util.ArrayList;

import net.hanse00.mfm.item.ModItems;
import net.hanse00.mfm.lib.Reference;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * More Foods Mod
 * 
 * BlockTomatoPlant
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockTomatoPlant extends BlockCrops {
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public BlockTomatoPlant(int par1) {
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
        return ModItems.tomatoSeeds.itemID;
    }

    @Override
    protected int getCropItem() {
        return ModItems.tomato.itemID;
    }

    @Override
    public int getRenderType() {
        return 1;
    }
    
    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        for (int i = 0; i < 4; i = i + 1) {
            super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
        }
    }
    
    @Override 
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

        if (metadata >= 7)
        {
            for (int n = 0; n < 0 + fortune; n++)
            {
                if (world.rand.nextInt(15) <= metadata)
                {
                    ret.add(new ItemStack(this.getSeedItem(), 1, 0));
                }
            }
        }

        return ret;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        iconArray = new Icon[4];

        for (int i = 0; i < iconArray.length; ++i) {
            iconArray[i] = par1IconRegister.registerIcon(Reference.MOD_ID
                    + ":tomatoPlant_" + i);
        }
    }
}