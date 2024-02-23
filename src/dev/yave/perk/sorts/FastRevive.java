package dev.yave.perk.sorts;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import dev.yave.perk.Perk;

public class FastRevive extends Perk{
	
	
	public FastRevive(Player player) {
		super(player);
	
	}

	@Override
	public double getX() {
		
		return 12;
	}
	
	@Override
	public double getY() {
		
		return 68;
	}
	@Override
	public double getZ() {
		
		return 33;
	}
	
	@Override
	public String getPerkNaam() {
		
		return "Fast Revive";
	}
	
	@Override
	public String getPerkDescription() {
		
		return "Revive team mates faster!";
	}
	
	@Override
	public PotionEffectType getPotionType() {
		
		return PotionEffectType.FIRE_RESISTANCE;
	}
	
	@Override
	public int getPerkDuration() {
		
		return 100000000;
	}

	@Override
	public int getPerkAmplifier() {

		return 1;
	}
	
	@Override
	public double getPerkPrice() {
		
		return 500;
	}

}
