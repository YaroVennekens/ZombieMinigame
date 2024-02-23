package dev.yave.misc.sorts;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import dev.yave.Game;
import dev.yave.misc.Misc;
import net.md_5.bungee.api.ChatColor;

public class Powerswitch extends Misc {

	public Powerswitch(Player player) {
		super(player);
		
	}

	@Override
	public String getName() {
		
		return "Powerswitch";
	}

	@Override
	public boolean isPower() {
		
		return true;
	}

	@Override
	public boolean isMysteryBox() {
		
		return false;
	}

	@Override
	public boolean isPackAPunch() {
		
		return false;
	}

	@Override
	public int getX() {
		
		return 6;
	}

	@Override
	public int getY() {
		
		return 83;
	}

	@Override
	public int getZ() {
		
		return 43;
	}

	@Override
	public int getPrice() {
		
		return 1000;
	}
	
	
	@SuppressWarnings("deprecation")
	public void turnOnPower(Player player) {
		boolean powerActived = false;
		Game game = new Game();
		
		if(powerActived == false) {
			
			
			
			for(Player players : Bukkit.getOnlinePlayers()) {
				players.sendTitle(ChatColor.GOLD + "Power has been turned on", "by " + player.getName());
			}
			game.setPower(true);
			powerActived = game.isPower();
		}else {
			game.setPower(true);
		}
		
		
		
	}
	

}
