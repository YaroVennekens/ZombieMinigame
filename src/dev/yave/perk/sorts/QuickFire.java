package dev.yave.perk.sorts;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import dev.yave.perk.Perk;

public class QuickFire extends Perk{

	public QuickFire(Player player) {
		super(player);
		
	}

	@Override
	public String getPerkNaam() {
		
		return "Quickfire";
	}

	@Override
	public String getPerkDescription() {
		
		return "Shoot bullets faster!";
	}

	@Override
	public PotionEffectType getPotionType() {
		
		return PotionEffectType.DAMAGE_RESISTANCE;
	}

	@Override
	public int getPerkDuration() {
		
		return 1000000;
	}

	@Override
	public int getPerkAmplifier() {
		
		return -4;
	}

	@Override
	public double getPerkPrice() {
		
		return 0;
	}

	@Override
	public double getX() {
		
		return 0;
	}

	@Override
	public double getY() {
		
		return 0;
	}

	@Override
	public double getZ() {
		
		return 0;
	}

}
