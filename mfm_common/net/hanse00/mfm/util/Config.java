package net.hanse00.mfm.util;

import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.hanse00.mfm.lib.BlockIds;
import net.hanse00.mfm.lib.ItemIds;
import net.hanse00.mfm.lib.Reference;
import net.minecraftforge.common.Configuration;

/**
 * More-Foods-Mod
 * 
 * Config
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class Config {

    public static void init(FMLPreInitializationEvent event) {
           Configuration config = new Configuration(event.getSuggestedConfigurationFile());
           
           try {
               config.load();
               
               ItemIds.BACON_RAW = config.getItem("Raw Bacon", ItemIds.BACON_RAW_DEFAULT).getInt();
               ItemIds.BACON_COOKED = config.getItem("Cooked Bacon", ItemIds.BACON_COOKED_DEFAULT).getInt();
               ItemIds.LETTUCE = config.getItem("Lettuce", ItemIds.LETTUCE_DEFAULT).getInt();
               ItemIds.LETTUCE_SEEDS = config.getItem("Lettuce Seeds", ItemIds.LETTUCE_SEEDS_DEFAULT).getInt();
               
               BlockIds.LETTUCE_PLANT = config.getBlock("Lettuce Plant", BlockIds.LETTUCE_PLANT_DEFAULT).getInt();
           }
           catch(Exception e) {
               FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
           }
           finally {
               config.save();
           }
    }
}
