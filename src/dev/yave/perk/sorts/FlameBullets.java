package dev.yave.perk.sorts;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import dev.yave.perk.Perk;

public class FlameBullets extends Perk{

	
	

	public FlameBullets(Player player) {
		super(player);
	
	}

	@Override
	public double getX() {
		
		return 9;
	}
	
	@Override
	public double getY() {
		
		return 69;
	}
	@Override
	public double getZ() {
		
		return 5;
	}
	
	@Override
	public String getPerkNaam() {
		
		return "Flame Bullets";
	}
	
	@Override
	public String getPerkDescription() {
		
		return "Shoot flame bullets!";
	}
	
	@Override
	public PotionEffectType getPotionType() {
		
		return PotionEffectType.NIGHT_VISION;
	}
	
	@Override
	public int getPerkDuration() {
		
		return 100000000;
	}
	@Override
	public double getPerkPrice() {
		
		return 750;
	}
	@Override
	public int getPerkAmplifier() {

		return 1;
	}
}
