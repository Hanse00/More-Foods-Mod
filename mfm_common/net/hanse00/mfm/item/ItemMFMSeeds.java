package net.hanse00.mfm.item;

import net.hanse00.mfm.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * More Foods Mod
 * 
 * ItemMFMSeeds
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemMFMSeeds extends ItemSeeds {
    public ItemMFMSeeds(int par1, int par2, int par3) {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION, par2, par3);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID
                + ":"
                + this.getUnlocalizedName().substring(
                        this.getUnlocalizedName().indexOf(".") + 1));
    }
}
