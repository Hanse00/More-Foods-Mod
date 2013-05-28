package net.hanse00.mfm.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.hanse00.mfm.lib.Reference;
import net.hanse00.mfm.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

/**
 * More-Foods-Mod
 * 
 * ItemRawBacon
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemRawBacon extends ItemFood {

    public ItemRawBacon(int par1, int par2, float par3, boolean par4) {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION, par2, par3, par4);
        this.setUnlocalizedName(Strings.RAW_BACON_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
