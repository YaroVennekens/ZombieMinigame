package dev.yave.perk;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dev.yave.Game;
import net.md_5.bungee.api.ChatColor;

public abstract class Perk {
    
    private Player player;
    
    public Perk(Player player) {
        this.player = player;
    }

    public abstract String getPerkNaam();
    public abstract String getPerkDescription();
    
    public abstract PotionEffectType getPotionType();
    public abstract int getPerkDuration();
    public abstract int getPerkAmplifier();

    public abstract double getPerkPrice();

    public abstract double getX();
    public abstract double getY();
    public abstract double getZ();
    

    public Player getPlayer() {
        return player;
    }

    public void givePlayerPerk(Player player) {
    	Game game = new Game();
    	
    	/**
    	 * TOOD: Controleren of de speler we genoeg munten heeft verdiend voor deze perk te kopen.
    	 */
    	
        int count = 0;

        for (PotionEffect activePotionEffect : player.getActivePotionEffects()) {
        	count++; 
        }
        
        // Je kan meer perks kopen als toegelaten als je in de debugmode bent.
        if(game.isPower()) {
		        if (count <= game.getMaxPerks() - 1 || game.isDebug()) {
		            PotionEffect potionEffect = new PotionEffect(getPotionType(), getPerkDuration(), getPerkAmplifier());
		            player.addPotionEffect(potionEffect);
		            player.sendMessage("You've bought " + getPerkNaam() + "!");
		            player.sendMessage("" + getPerkDescription() + "!");
		            player.playSound(player.getLocation(), Sound.NOTE_PLING, 10, 10);
		        } else {
		            player.sendMessage(ChatColor.GRAY + "You can't get any more perks because you've reached the limit" + ChatColor.RED + "Maximum perks [" + count + "/" + game.getMaxPerks() +"]");
		        }
		        }else {
		        	
		        	player.sendMessage(ChatColor.RED + "You need to turn on power first to activate perks!");
		        	player.playSound(player.getLocation(), Sound.NOTE_BASS_DRUM, 10, 10);
		        }
        
    }

    public void showPerkInfo(Player player) {
        Game game = new Game();
    	if (game.isDebug()) {
            player.sendMessage("Perk name: " + getPerkNaam());
            player.sendMessage("Perk type: " + getPotionType());
            player.sendMessage("Perk duration: " + getPerkDuration());
            player.sendMessage("Perk Amplifier: " + getPerkAmplifier());
            player.sendMessage("Perk price: " + getPerkPrice());
        }
    }
}
