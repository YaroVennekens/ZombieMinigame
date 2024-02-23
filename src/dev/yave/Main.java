package dev.yave;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dev.yave.commands.DebugCommand;
import dev.yave.listener.DoorListener;
import dev.yave.listener.MiscListener;
import dev.yave.listener.PerkMachine;
import dev.yave.listener.player.PlayerConnectListener;

public class Main extends JavaPlugin {
	
	
	public Game game = new Game();
	
	public static Main getInstance;
	
	public void onEnable() {
		
		registerEvents();
		registerCommands();
	}
	
	public void onDisable() {
		
	}
	
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new PlayerConnectListener(), this);
		pm.registerEvents(new PerkMachine(), this);
		pm.registerEvents(new MiscListener(), this);
		pm.registerEvents(new DoorListener(), this);
	}
	
	public void registerCommands() {
		getCommand("debug").setExecutor(new DebugCommand());
	}

	public Game getGame() {
		return game;
	}
	
	public static Main getInstance() {
		return getInstance;
	}

	
}
