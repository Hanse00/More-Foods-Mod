package net.hanse00.mfm.util;

import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * More Foods Mod
 * 
 * LocalizationUtil
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class LocalizationUtil {
    public static boolean isXMLLanguageFile(String fileName) {
        return fileName.endsWith(".xml");
    }

    public static String getLocaleFromFileName(String fileName) {
        return fileName.substring(fileName.lastIndexOf('/') + 1,
                fileName.lastIndexOf('.'));
    }

    public static String getLocalizedString(String key) {
        return LanguageRegistry.instance().getStringLocalization(key);
    }
}