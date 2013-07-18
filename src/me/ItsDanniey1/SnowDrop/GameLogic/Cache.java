package me.ItsDanniey1.SnowDrop.GameLogic;

import java.util.HashMap;

import me.ItsDanniey1.SnowDrop.GameLogic.RSPlayer;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Cache {
	
	public static HashMap<String, Integer> usedSpawns = new HashMap<>();
	public static HashMap<Player, String> AlivePlayers = new HashMap<Player, String>();
	public static HashMap<Player, String> DeadPlayers = new HashMap<Player, String>();
	public static HashMap<String, RSPlayer> RSPlayers = new HashMap<String, RSPlayer>();
	
	//Sword classes
	
	public static HashMap<Player, String> worst = new HashMap<Player, String>();
	public static HashMap<Player, String> orate = new HashMap<Player, String>();
	public static HashMap<Player, String> medium = new HashMap<Player, String>();
	public static HashMap<Player, String> better = new HashMap<Player, String>();
	public static HashMap<Player, String> best = new HashMap<Player, String>();





	
	public static HashMap<Integer, ItemStack> Items = new HashMap<Integer, ItemStack>();

	
	public static void clearAll() {
		usedSpawns.clear();
		AlivePlayers.clear();
		DeadPlayers.clear();
		RSPlayers.clear();
		worst.clear();
		orate.clear();
		medium.clear();
		better.clear();
		best.clear();

		
	}

}
