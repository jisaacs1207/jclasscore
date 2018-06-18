package io.jisaacs.ci.jclasscore;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JClassCore extends JavaPlugin implements Listener {
    public static JClassCore plugin;

    @Override
    public void onEnable() {
        registerEvents(this, new Novice(), new Utility(), new Commands());

    }

    @Override
    public void onDisable() {
        plugin = null;
    }

    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
}
