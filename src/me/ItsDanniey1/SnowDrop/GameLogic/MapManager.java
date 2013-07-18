package me.ItsDanniey1.SnowDrop.GameLogic;

import me.ItsDanniey1.SnowDrop.GameLogic.MapManager;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class MapManager {

	public static int map = 0;
	public static String worldList[] = { "SnowDrop" };

	public static World getWorld() {
		switch (map) {
		case 0:
			return Bukkit.getServer().getWorld(worldList[0]);
		}
		return null;
	}

	public static double[][] getSpawns() {
		double spawns1[][] = {

				{-3.0, 86.0, -5.0},
				{-8.0, 86.0, -4.0},
				{-13.0, 86.0, -1.0},
				{-16.0, 86.0, 4.0},
				{-17.0, 86.0, 9.0  },
				{-16.0, 86.0, 14.0},
				{-13.0, 86.0, 19.0  },
				{-8.0, 86.0, 22.0  },
				{-3.0, 86.0, 23.0},
				{2.0, 86.0, 22.0},
				{7.0, 86.0, 19.0},  
				{10.0, 86.0, 14.0},
				{11.0, 86.0, 9.0},
				{10.0, 86.0, 4.0},
				{7.0, 86.0, -1.0},  
				{2.0, 86.0, -4.0},

				};

		switch (map) {
		case 0:
			return spawns1;

		}
		return null;
	}
}
