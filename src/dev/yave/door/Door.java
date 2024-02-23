package dev.yave.door;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public abstract class Door {

    private Player player;

    public Door(Player player) {
        this.player = player;
    }
    
    public Door() {
    	
    }

    public abstract String getName();
    
    public abstract Location TopLeft();
    
    public abstract Location BottomRight();
    
   
 
    public abstract double getPrice();

    public Player getPlayer() {
        return player;
    }
}
