package me.teixtarcio;

import me.teixtarcio.commands.tspawnersCommand;
import me.teixtarcio.listeners.mobSpawning;
import me.teixtarcio.listeners.placingSpawners;
import me.teixtarcio.listeners.silkTouch;
import me.teixtarcio.spawners.slime;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

public final class TSpawners extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        slime.init();
        getCommand("tspawners").setExecutor(new tspawnersCommand());
        getServer().getPluginManager().registerEvents(new mobSpawning(), this);
        getServer().getPluginManager().registerEvents(new silkTouch(this), this);
        saveDefaultConfig();

        //getServer().getPluginManager().registerEvents(new placingSpawners(), this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[TSpawners] Plugin has been enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
