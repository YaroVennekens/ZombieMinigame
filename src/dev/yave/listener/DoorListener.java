package dev.yave.listener;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import dev.yave.Game;
import dev.yave.door.Door;
import dev.yave.door.list.HotelDoor;
import dev.yave.door.list.OfficeDoor;

public class DoorListener implements Listener {
	
	public Game game = new Game();
	

	public ArrayList<Door> getDoors(Player player) {
		
		ArrayList<Door> doors = new ArrayList<Door>();
		
		Door hotelDoor = new HotelDoor(player);
		Door officeDoor = new OfficeDoor(player);
		
		doors.add(officeDoor);
		doors.add(hotelDoor);
		
		
		
		return doors;
	}
	
	@EventHandler
	public void blockPlace(BlockPlaceEvent event) {
		
		if(game.isDebug()) {
			  Block block = event.getBlock();
			  Bukkit.getConsoleSender().sendMessage("" + block.getX() + "," + block.getY() + "," + block.getZ());
		}
	}

	@EventHandler
	public void openDoor(PlayerInteractEvent event) {
		
	Block block = event.getClickedBlock();
		Player player = event.getPlayer();
		
	
		
		for(Door door : getDoors(player)) {
		
			
			if(game.isDebug()) {
				
				if(block != null) {
				  Location topLeft = new Location(player.getWorld(), door.TopLeft().getX(), door.TopLeft().getY(), door.TopLeft().getZ());
				  Location topRight = new Location(player.getWorld(), door.BottomRight().getX(), door.BottomRight().getY(), door.BottomRight().getZ());
				  Location clickLocation = block.getLocation();
				  if (isWithinSquare(topLeft, topRight, clickLocation)) {
		                for(Player players : Bukkit.getOnlinePlayers()) {
		                	players.sendTitle("" + door.getName() + " opened", "");
		                	
		                	players.playSound(players.getLocation(), Sound.FIREWORK_TWINKLE, 10, 10);
		                	 fillSquare(player, topLeft, topRight, Material.AIR);
		                }
		              
		            }
				}
				  }
			
		}

	}
	
	

	 private void fillSquare(Player player, Location topLeft, Location bottomRight, Material material) {
	        World world = topLeft.getWorld();

	        int startX = Math.min(topLeft.getBlockX(), bottomRight.getBlockX());
	        int startY = Math.min(topLeft.getBlockY(), bottomRight.getBlockY());
	        int startZ = Math.min(topLeft.getBlockZ(), bottomRight.getBlockZ());

	        int endX = Math.max(topLeft.getBlockX(), bottomRight.getBlockX());
	        int endY = Math.max(topLeft.getBlockY(), bottomRight.getBlockY());
	        int endZ = Math.max(topLeft.getBlockZ(), bottomRight.getBlockZ());

	        for (int x = startX; x <= endX; x++) {
	            for (int y = startY; y <= endY; y++) {
	                for (int z = startZ; z <= endZ; z++) {
	                    Block block = world.getBlockAt(x, y, z);
	                    block.setType(material);
	                }
	            }
	        }

	      
	    }
	
	 
	 private boolean isWithinSquare(Location topLeft, Location bottomRight, Location clickLocation) {
	        int minX = Math.min(topLeft.getBlockX(), bottomRight.getBlockX());
	        int minY = Math.min(topLeft.getBlockY(), bottomRight.getBlockY());
	        int minZ = Math.min(topLeft.getBlockZ(), bottomRight.getBlockZ());

	        int maxX = Math.max(topLeft.getBlockX(), bottomRight.getBlockX());
	        int maxY = Math.max(topLeft.getBlockY(), bottomRight.getBlockY());
	        int maxZ = Math.max(topLeft.getBlockZ(), bottomRight.getBlockZ());

	        int clickX = clickLocation.getBlockX();
	        int clickY = clickLocation.getBlockY();
	        int clickZ = clickLocation.getBlockZ();

	        return clickX >= minX && clickX <= maxX &&
	               clickY >= minY && clickY <= maxY &&
	               clickZ >= minZ && clickZ <= maxZ;
	    }
	

}
