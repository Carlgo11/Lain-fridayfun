package com.carlgo11.lain_plugin.fridayfun;

import com.carlgo11.lain_plugin.fridayfun.player.PlayerReveiveNameTagEvent;
import java.io.File;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable()
    {
        loconf();
        getServer().getPluginManager().registerEvents(new PlayerReveiveNameTagEvent(this), this);
    }

    public void onDisable()
    {

    }

    public void loconf()
    {
        File config = new File(getDataFolder(), "config.yml");
        if (!config.exists()) {
            saveDefaultConfig();
            getConfig().options().copyHeader(true);

            System.out.println("[Lain] No config.yml detected, config.yml created");
        }

    }

}
