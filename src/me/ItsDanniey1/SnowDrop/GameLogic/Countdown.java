package me.ItsDanniey1.SnowDrop.GameLogic;

import me.ItsDanniey1.SnowDrop.GameLogic.EndCount;
import me.ItsDanniey1.SnowDrop.Items;
import me.ItsDanniey1.SnowDrop.SnowDrop;

import me.ItsDanniey1.SnowDrop.GameLogic.GameState;
import me.ItsDanniey1.SnowDrop.GameLogic.StateManager;
import me.ItsDanniey1.SnowDrop.GameLogic.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Countdown implements Runnable {

	public static SnowDrop plugin;

	private static int taskID;
	private int tick = 0;

	@Override
	public void run() {

		if (tick == 0) {
			SnowDrop.prepGame();

			GameManager.cancelTask();
		}

		if (tick <= 9) {
			Utils.broadcast(ChatColor.YELLOW + "Game starting in "
					+ ChatColor.GREEN + (10 - tick) + " seconds");
		}

		if (tick == 10) {
			StateManager.setState(GameState.IN_PROGRESS);
			SnowDrop.startGame();
			Utils.broadcast(ChatColor.GREEN + "Game has STARTED!");

			for (Player players : Bukkit.getServer().getOnlinePlayers()) {

				Inventory inv = players.getInventory();


				inv.addItem(Items.getSnowballs());
			}

		}

		if (tick == 20) {

			Utils.broadcast("DROPPING IN 10 SECONDS!");
		}

		if (tick == 30) {

			int lowX = -20;
			int lowZ = -8;

			int highX = 14;
			int highZ = 26;

			int Y = 84;
			
			Utils.broadcast(ChatColor.RED + "DROPPED!");

			for (int x = -20; x <= 14; x++) {
				for (int z = -8; z <= 26; z++) {
					for (int y = 84; y <= 84;) {

						World world = MapManager.getWorld();
						Block block = world.getBlockAt(lowX + x, y, lowZ + z);
						if (block.getType() == Material.STAINED_CLAY) {
							{
								block.setType(Material.AIR);
							}
						}
					}
				}
			}
		}

		if (tick == 60) {

			int lowX = -20;
			int lowZ = -8;

			int highX = 14;
			int highZ = 26;

			int Y = 85;
			
			Utils.broadcast(ChatColor.RED + "DROPPED!");


			for (int x = -20; x <= 14; x++) {
				for (int z = -8; z <= 26; z++) {
					for (int y = 85; y <= 85;) {

						World world = MapManager.getWorld();
						Block block = world.getBlockAt(lowX + x, y, lowZ + z);
						if (block.getType() == Material.STAINED_CLAY) {
							{
								block.setType(Material.AIR);
							}
						}
					}
				}
			}
		}
		
		if (tick == 85) {

			int lowX = -20;
			int lowZ = -8;

			int highX = 14;
			int highZ = 26;

			int Y = 86;

			Utils.broadcast(ChatColor.RED + "DROPPED!");

			for (int x = -20; x <= 14; x++) {
				for (int z = -8; z <= 26; z++) {
					for (int y = 86; y <= 86;) {

						World world = MapManager.getWorld();
						Block block = world.getBlockAt(lowX + x, y, lowZ + z);
						if (block.getType() == Material.STAINED_CLAY) {
							{
								block.setType(Material.AIR);
							}
						}
					}
				}
			}
		}
		
		if (tick == 105) {

			int lowX = -20;
			int lowZ = -8;

			int highX = 14;
			int highZ = 26;

			int Y = 87;

			Utils.broadcast(ChatColor.RED + "DROPPED!");

			for (int x = -20; x <= 14; x++) {
				for (int z = -8; z <= 26; z++) {
					for (int y = 87; y <= 87;) {

						World world = MapManager.getWorld();
						Block block = world.getBlockAt(lowX + x, y, lowZ + z);
						if (block.getType() == Material.STAINED_CLAY) {
							{
								block.setType(Material.AIR);
							}
						}
					}
				}
			}
		}

		if (tick == 120) {

			int lowX = -20;
			int lowZ = -8;

			int highX = 14;
			int highZ = 26;

			int Y = 88;

			Utils.broadcast(ChatColor.RED + "DROPPED!");

			for (int x = -20; x <= 14; x++) {
				for (int z = -8; z <= 26; z++) {
					for (int y = 88; y <= 88;) {

						World world = MapManager.getWorld();
						Block block = world.getBlockAt(lowX + x, y, lowZ + z);
						if (block.getType() == Material.STAINED_CLAY) {
							{
								block.setType(Material.AIR);
							}
						}
					}
				}
			}
		}
		
		if (tick == 135) {

			int lowX = -20;
			int lowZ = -8;

			int highX = 14;
			int highZ = 26;

			int Y = 89;

			Utils.broadcast(ChatColor.RED + "DROPPED!");

			for (int x = -20; x <= 14; x++) {
				for (int z = -8; z <= 26; z++) {
					for (int y = 89; y <= 89;) {

						World world = MapManager.getWorld();
						Block block = world.getBlockAt(lowX + x, y, lowZ + z);
						if (block.getType() == Material.STAINED_CLAY) {
							{
								block.setType(Material.AIR);
							}
						}
					}
				}
			}
		}

		
		if (tick == 150) {

			int lowX = -20;
			int lowZ = -8;

			int highX = 14;
			int highZ = 26;

			int Y = 90;

			Utils.broadcast(ChatColor.RED + "DROPPED!");

			for (int x = -20; x <= 14; x++) {
				for (int z = -8; z <= 26; z++) {
					for (int y = 90; y <= 90;) {

						World world = MapManager.getWorld();
						Block block = world.getBlockAt(lowX + x, y, lowZ + z);
						if (block.getType() == Material.STAINED_CLAY) {
							{
								block.setType(Material.AIR);
							}
						}
					}
				}
			}
		}



		if (tick == 190) {
			Utils.broadcast(ChatColor.YELLOW + "GAME ENDING IN "
					+ ChatColor.GREEN + " 2 minutes!");
		}

		if (tick == 250) {
			Utils.broadcast(ChatColor.YELLOW + "GAME ENDING IN "
					+ ChatColor.GREEN + " 1 minute!");
		}

		if (tick == 300) {
			Utils.broadcast(ChatColor.YELLOW + "GAME ENDING IN "
					+ ChatColor.YELLOW + " 10 seconds!");
		}

		if (tick == 305) {
			Utils.broadcast(ChatColor.YELLOW + "GAME ENDING IN "
					+ ChatColor.RED + " 5 seconds!");
		}

		if (tick == 310) {
			// SnowDrop.finishGame();

			EndCount cd = new EndCount();
			cd.setTaskID(Bukkit.getServer().getScheduler()
					.scheduleSyncRepeatingTask(SnowDrop.plugin, cd, 0L, 20L));
		}
		tick++;

	}

	public void setTaskID(int i) {
		this.taskID = i;
	}

	public static void cancelTask() {
		Bukkit.getServer().getScheduler().cancelTask(taskID);
	}

}
