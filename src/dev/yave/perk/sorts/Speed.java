package dev.yave.perk.sorts;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import dev.yave.perk.Perk;

public class Speed extends Perk{

	public Speed(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPerkNaam() {
		
		return "Speed";
	}

	@Override
	public String getPerkDescription() {

		return "Walk faster";
	}

	@Override
	public PotionEffectType getPotionType() {
		
		return PotionEffectType.SPEED;
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
		
		return 500;
	}

	@Override
	public double getX() {
		
		return -4;
	}

	@Override
	public double getY() {
		
		return 77;
	}

	@Override
	public double getZ() {
		
		return 35;
	}

}
