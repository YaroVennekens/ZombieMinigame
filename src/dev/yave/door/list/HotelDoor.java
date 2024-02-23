package dev.yave.door.list;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import dev.yave.door.Door;

public class HotelDoor extends Door{

	public HotelDoor(Player player) {
		super(player);
		
	}

	@Override
	public Location TopLeft() {
		Location location = new Location(super.getPlayer().getWorld(), 11,71,22);
		return location;
	}

	@Override
	public Location BottomRight() {
		Location location = new Location(super.getPlayer().getWorld(), 11,68,20);
		return location;
	}



	@Override
	public double getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		
		return "Hotel Door";
	}

}
