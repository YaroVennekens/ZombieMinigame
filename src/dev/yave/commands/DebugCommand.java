package dev.yave.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.yave.Game;
import net.md_5.bungee.api.ChatColor;

public class DebugCommand implements CommandExecutor {

	
	public Game game = new Game();
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Command can only be performed by players!");
            return true;
        }

        Player player = (Player) sender;
        if (!player.hasPermission("zombies.command")) {
            player.sendMessage(ChatColor.RED + "You don't have permission to perform this command");
            return true;
        }
        if (args.length == 0) {
            sendHelpMessage(player);
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("power")) {
                togglePower(player, game);
            } else if (args[0].equalsIgnoreCase("mode")) {
                toggleDebug(player, game);
            } else {
                sendHelpMessage(player);
            }
        } else if (args.length == 2 && args[0].equalsIgnoreCase("mode") && args[1].equalsIgnoreCase("info")) {
            sendDebugInfo(player, game);
        } else {
            sendHelpMessage(player);
        }

        return true;
    }
    private void sendHelpMessage(Player player) {
        for (int i = 0; i < 3; i++) {
            player.sendMessage(" ");
        }
        player.sendMessage(ChatColor.DARK_GREEN + "Zombies plugin by Yaro Vennekens\n");
        player.sendMessage("/debug power -> turn on power");
        player.sendMessage("/debug mode -> turn on debug mode");
        player.sendMessage("/debug mode info -> display debug info");
        	
        for (int i = 0; i < 3; i++) {
            player.sendMessage(" ");
        }
    }
    private void togglePower(Player player, Game game) {
        if (!game.isPower()) {
            game.setPower(true);
            player.sendMessage(ChatColor.GREEN + "Power has been turned on");
        } else {
            game.setPower(false);
            player.sendMessage(ChatColor.RED + "Power has been turned off");
        }
    }

    private void toggleDebug(Player player, Game game) {
        if (!game.isDebug()) {
            game.setDebug(true);
            player.sendMessage(ChatColor.GREEN + "Debug has been turned on");
        } else {
            game.setDebug(false);
            player.sendMessage(ChatColor.RED + "Debug has been turned off");
        }
    }

    private void sendDebugInfo(Player player, Game game) {
        player.sendMessage("Debug mode " + game.isDebug());
        player.sendMessage("Power turned on " + game.isPower());
    	
    }
    
    
    
}
