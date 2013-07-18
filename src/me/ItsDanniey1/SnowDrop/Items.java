package me.ItsDanniey1.SnowDrop;

import java.util.ArrayList;
import java.util.Random;

import me.ItsDanniey1.SnowDrop.GameLogic.Cache;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

//import daneffectapi.DanEffectAPI;
//import daneffectapi.Particles;

public class Items implements Listener {

	public static SnowDrop plugin;
	
	private Random rand = new Random();
	
	//Generate a random number between A and B.
	public int getRandom(int a,int b)
	{
	  return (int) Math.round((Math.random()*b)+a);
	}
	
	

	public static ItemStack getSnowballs() {
		ItemStack best = new ItemStack(Material.IRON_HOE, 1);
		best.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		ItemMeta im = best.getItemMeta();
		im.setDisplayName(ChatColor.GREEN + "Snow Shooter");
		best.setItemMeta(im);

		return best;
	}

	public static ItemStack getBook() {
		ItemStack is = new ItemStack(Material.WRITTEN_BOOK, 1);
		is.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		BookMeta bm = (BookMeta) is.getItemMeta();
		bm.setAuthor("the Creators");
		bm.setTitle(ChatColor.GREEN + "RESTOCK!");
		ArrayList<String> pages = new ArrayList<String>();
		pages.add(ChatColor.DARK_PURPLE + "Restock" + ChatColor.BLUE
				+ " is a custom server gametype created by Danniey1 and " + ChatColor.RED + "DCDJ!"
				+ ChatColor.GREEN + "\n\n\n\nRestock" + ChatColor.BLUE
				+ " A game of luck and skill!");
		pages.add(ChatColor.BLUE
				+ "The way to win "
				+ ChatColor.DARK_PURPLE
				+ "Restock "
				+ ChatColor.BLUE
				+ "is by being the last player alive. \n\nThe best way to win is by running over the"
				+ ChatColor.GREEN + " EMERALD BLOCKS" + ChatColor.BLUE
				+ " on the floor, and they will give you a weapon!");
		pages.add(ChatColor.GOLD.toString()
				+ ChatColor.BOLD.toString()
				+ "The Game!"
				+ ChatColor.BLUE
				+ "\n\nOnce the game has started, you should aim to run over an emerald block, which gives you an item! \n\nAfter 45 seconds, the EMERALD BLOCKS will be activated again, allowing you to run over them once more!");
				pages.add(
				ChatColor.RED
				+ "\n\n Be careful though, as running over an emerald block makes you lose whatever you had, so let's hope you're lucky!");

		bm.setPages(pages);
		is.setItemMeta(bm);
		return is;
	}
}
