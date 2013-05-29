package net.hanse00.mfm.util;

import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.hanse00.mfm.lib.ItemIds;
import net.hanse00.mfm.lib.Reference;
import net.minecraftforge.common.Configuration;

public class Config {

    public static void init(FMLPreInitializationEvent event) {
           Configuration config = new Configuration(event.getSuggestedConfigurationFile());
           
           try {
               config.load();
               
               ItemIds.RAW_BACON = config.getItem("Raw Bacon", ItemIds.RAW_BACON_DEFAULT).getInt(ItemIds.RAW_BACON_DEFAULT);
               ItemIds.COOKED_BACON = config.getItem("Cooked Bacon", ItemIds.COOKED_BACON_DEFAULT).getInt(ItemIds.RAW_BACON_DEFAULT);
           }
           catch(Exception e) {
               FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
           }
           finally {
               config.save();
           }
    }
}
