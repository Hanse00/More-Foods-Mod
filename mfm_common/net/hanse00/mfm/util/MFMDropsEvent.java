package net.hanse00.mfm.util;

import net.hanse00.mfm.item.ModItems;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

/**
 * More Foods Mod
 * 
 * MFMDropsEvent
 * 
 * @author hanse00
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class MFMDropsEvent {
    public static double rand;

    @ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
        if (event.entityLiving instanceof EntityPig) {
            rand = Math.random();
            if (event.source.getDamageType().equals("player")) {
                if (rand <= 0.25d) {
                    event.entityLiving.dropItem(ModItems.baconRaw.itemID, 2);
                }
                if (rand >= 0.25d && rand <= 0.75d) {
                    event.entityLiving.dropItem(ModItems.baconRaw.itemID, 1);
                }
            }
            if (event.source.getSourceOfDamage() instanceof EntityArrow) {
                if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null) {
                    if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer) {
                        if (rand <= 0.25d) {
                            event.entityLiving.dropItem(
                                    ModItems.baconRaw.itemID, 2);
                        }
                        if (rand >= 0.25d && rand <= 0.75d) {
                            event.entityLiving.dropItem(
                                    ModItems.baconRaw.itemID, 1);
                        }
                    }
                }
            }
            if (event.source.getDamageType().equals("onFire")) {
                if (rand <= 0.25d) {
                    event.entityLiving.dropItem(ModItems.baconCooked.itemID, 2);
                }
                if (rand >= 0.25d && rand <= 0.75d) {
                    event.entityLiving.dropItem(ModItems.baconCooked.itemID, 1);
                }
            }
        }
    }
}
