package dev.yave.door.list;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import dev.yave.door.Door;

public class OfficeDoor extends Door{

	public OfficeDoor(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		
		return "Office door";
	}

	@Override
	public Location TopLeft() {
		Location location = new Location(super.getPlayer().getWorld(), 26,71,42);
		return location;
	}

	@Override
	public Location BottomRight() {
		Location location = new Location(super.getPlayer().getWorld(), 26,68,44);
		return location;
	}

	@Override
	public double getPrice() {
		
		return 1000;
	}

	
}
