package io.dpteam.VoteBroadcast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public Main() {
		super();
	}

	public void onEnable() {
		this.getServer().getLogger().info("[VoteBroadcast] Plugin loaded and enabled");
	}

	@Override
	public void onDisable() {
		this.getServer().getLogger().info("[VoteBroadcast] Plugin unloaded and disabled");
	}

	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		sender.sendMessage(ChatColor.AQUA + "> " + ChatColor.RED + "> " + ChatColor.AQUA + "> " + ChatColor.BOLD + ChatColor.AQUA + " Voting links:\n" + ChatColor.GOLD + "link1\n" + ChatColor.GOLD + "link2\n" + ChatColor.GOLD + "link3\nlink4");
		return true;
	}
}
