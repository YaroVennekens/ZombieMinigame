package dev.yave.perk.sorts;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import dev.yave.perk.Perk;

public class FrozenBullets extends Perk{

	public FrozenBullets(Player player) {
		super(player);
		
	}
	
	@Override
	public double getX() {
		
		return 16;
	}
	
	@Override
	public double getY() {
		
		return 76;
	}
	@Override
	public double getZ() {
		
		return -12;
	}
	@Override
	public String getPerkNaam() {
		
		return "Frozen Bullets";
	}
	
	@Override
	public String getPerkDescription() {
		
		
		return "Shoot frozen bullets!";
	}
	
	@Override
	public PotionEffectType getPotionType() {
		
		return PotionEffectType.ABSORPTION;
	}
	
	@Override
	public int getPerkDuration() {
		
		return 100000000;
	}
	@Override
	public double getPerkPrice() {
		
		return 1000;
	}
	@Override
	public int getPerkAmplifier() {

		return 1;
	}
}
