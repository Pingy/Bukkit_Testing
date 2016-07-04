package com.pingy;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

/**
 * Created by thlappy on 7/4/2016.
 */
public class Test extends JavaPlugin {

    public void onEnable() {
       getLogger().info("Starting up.");
    }

    public void onDisable() {
        getLogger().info("Going down.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("bam")) {

                player.sendMessage(ChatColor.AQUA + "Hey, what are you doing?");
                player.setVelocity(new Vector(1, 1, 1));
                World world = player.getWorld();
                world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 2F, 2 );
            }
            else {
                getLogger().info("Dude you aren't even a player.");
            }
        }
     return false;
    }


}
