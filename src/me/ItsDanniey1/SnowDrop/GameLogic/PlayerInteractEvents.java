package me.ItsDanniey1.SnowDrop.GameLogic;

import me.ItsDanniey1.SnowDrop.SnowDrop;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

//import daneffectapi.DanEffectAPI;
//import daneffectapi.Particles;

public class PlayerInteractEvents implements Listener {

	public static SnowDrop plugin;

	public void removeBall(PlayerInteractEvent event) {

		if (event.getAction() == Action.RIGHT_CLICK_AIR
				|| event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Player player = event.getPlayer();
			
			if(player.getItemInHand().getType() == Material.IRON_HOE) {
				
				Snowball snowball = player.launchProjectile(Snowball.class);
				snowball.setShooter(player);
				
			}
		}
	}
}
