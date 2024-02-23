package dev.yave.perk.sorts;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import dev.yave.perk.Perk;

public class ExtraHealth extends Perk {

	public ExtraHealth(Player player) {
		super(player);
		
	}

	@Override
	public String getPerkNaam() {
		
		return "Extra Health";
	}

	@Override
	public String getPerkDescription() {
		
		return "You get more health";
	}

	@Override
	public PotionEffectType getPotionType() {
		
		return null;
	}

	@Override
	public int getPerkDuration() {
		
		return 100000;
	}

	@Override
	public int getPerkAmplifier() {
		
		return 1;
	}

	@Override
	public double getPerkPrice() {
		
		return 1000;
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
