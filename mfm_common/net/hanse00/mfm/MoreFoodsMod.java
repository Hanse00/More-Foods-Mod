package net.hanse00.mfm;

import net.hanse00.mfm.block.ModBlocks;
import net.hanse00.mfm.item.ModItems;
import net.hanse00.mfm.lib.Reference;
import net.hanse00.mfm.util.Config;
import net.hanse00.mfm.util.MFMDropsEvent;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * More Foods Mod
 * 
 * MoreFoodsMod
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MoreFoodsMod {
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        // Initialize the configuration
        Config.init(event);

        // Initialize mod blocks
        ModBlocks.init();

        // Initialize mod items
        ModItems.init();
    }

    @Init
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new MFMDropsEvent());
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }
}
