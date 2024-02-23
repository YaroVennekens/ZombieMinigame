package dev.yave.listener;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import dev.yave.misc.sorts.Powerswitch;

public class MiscListener implements Listener {
	
	
	
	@EventHandler
	public void interactMisc(PlayerInteractEvent event) {
		Player player = (Player)event.getPlayer();
		Block block = event.getClickedBlock();
		Powerswitch powerSwitch = new Powerswitch(player);
		
		 Location powerLocation = new Location(
                 player.getWorld(), 
                 powerSwitch.getX(),
                 powerSwitch.getY(), 
                 powerSwitch.getZ()  
         );

         if (event.getAction() == Action.RIGHT_CLICK_BLOCK && block.getLocation().equals(powerLocation)) {
        	 powerSwitch.turnOnPower(player);
        	 event.setCancelled(true);
         }
	}
	
	
	

}
