package com.carlgo11.lain_plugin.fridayfun;

import com.carlgo11.lain_plugin.fridayfun.player.PlayerReveiveNameTagEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new PlayerReveiveNameTagEvent(), this);
    }

    public void onDisable()
    {

    }

}
