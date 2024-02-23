package dev.yave.listener;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import dev.yave.perk.Perk;
import dev.yave.perk.sorts.FastRevive;
import dev.yave.perk.sorts.FlameBullets;
import dev.yave.perk.sorts.FrozenBullets;
import dev.yave.perk.sorts.Speed;

public class PerkMachine implements Listener {
    
    @EventHandler
    public void playerInteract(PlayerInteractEvent event) {
    	ArrayList<Perk> perks = new ArrayList<Perk>();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
       
        Perk perkFrozenbullets = new FrozenBullets(player);
        Perk perkFlameBullets = new FlameBullets(player);
        Perk perkFastRevive = new FastRevive(player);
        Perk perkSpeed = new Speed(player);
        
        
        perks.add(perkFrozenbullets);
        perks.add(perkFastRevive);
        perks.add(perkSpeed);
        perks.add(perkFlameBullets);
    
        if (block != null) { 
         
        	 for(Perk perk : perks) {
        		  Location perkLocation = new Location(
        				  				player.getWorld(), 
        				  				perk.getX(),
        				  				perk.getY(), 
        				  				perk.getZ()  
                  );

                  if (event.getAction() == Action.RIGHT_CLICK_BLOCK && block.getLocation().equals(perkLocation)) {
                  	perk.showPerkInfo(player);
                  	perk.givePlayerPerk(player);
                  }
        	 }

          
            
            
        }
    }
}
