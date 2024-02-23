package dev.yave.misc;

import org.bukkit.entity.Player;

public abstract class Misc {

	private Player player;
	
    public Misc(Player player) {
    	
    	this.player = getPlayer();
    	
    }
    
   
	public  abstract String getName();
	
	public abstract boolean isPower();

	public abstract boolean isMysteryBox();
	
	public abstract boolean isPackAPunch();
	
	public abstract int getX();
		
	public abstract int getY();
	
	public abstract int getZ();
	
	public abstract int getPrice();
	
    public Player getPlayer() {
		return player;
	}
    
    
}
