package dev.yave.listener.player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerConnectListener implements Listener {
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = (Player)event.getPlayer();
		 
		event.setJoinMessage(ChatColor.GREEN + "[+] " + player.getName() + " joined the game");
		
		
	}
	
	@EventHandler
	public void onLeave(PlayerQuitEvent event) {
		Player player = (Player)event.getPlayer();
		 
		event.setQuitMessage(ChatColor.GREEN + "[+] " + player.getName() + " left the game");
		
		
		
	}
	
	

}
