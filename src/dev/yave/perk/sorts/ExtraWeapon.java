package dev.yave.perk.sorts;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import dev.yave.perk.Perk;

public class ExtraWeapon extends Perk{

	public ExtraWeapon(Player player) {
		super(player);
	
	}

	@Override
	public String getPerkNaam() {
		
		return "Extra weapon";
	}

	@Override
	public String getPerkDescription() {
		
		return "Get extra weapon slot";
	}

	@Override
	public PotionEffectType getPotionType() {
		
		return null;
	}

	@Override
	public int getPerkDuration() {
		
		return 1000000;
	}

	@Override
	public int getPerkAmplifier() {
		
		return 1;
	}

	@Override
	public double getPerkPrice() {
		
		return 1500;
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
