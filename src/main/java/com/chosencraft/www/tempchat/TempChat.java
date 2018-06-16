package com.chosencraft.www.tempchat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TempChat extends JavaPlugin
{

    public void onEnable()
    {
        Bukkit.getPluginManager().registerEvents( new ChatListener() , this);
        getCommand("help").setExecutor(new HelpCommand());
    }

    public void onDisable()
    {

    }


}
