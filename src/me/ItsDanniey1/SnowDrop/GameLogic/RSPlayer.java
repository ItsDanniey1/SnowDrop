package me.ItsDanniey1.SnowDrop.GameLogic;

import me.ItsDanniey1.SnowDrop.GameLogic.Cache;


public class RSPlayer {

	private String name;
	private int knocks;
	private int deaths;
	private int powerupsUsed;

	public RSPlayer(String name) {
		this.name = name;
		this.knocks = 0;
		this.deaths = 0;
		this.powerupsUsed = 0;
	}
	
	public int addKill() {
		this.knocks = this.knocks+1;
		return this.knocks;
	}
	
	public int addDeath() {
		this.deaths = this.deaths+1;
		return this.deaths;
	}
	
	public int addPowerup() {
		this.powerupsUsed = this.powerupsUsed+1;
		return this.powerupsUsed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getknocks() {
		return this.knocks;
	}
	
	public int getDeaths() {
		return this.deaths;
	}
	
	public int getPowerupsUsed() {
		return this.powerupsUsed;
	}
	
	public void save() {
		Cache.RSPlayers.put(this.name, this);
	}
}
 
