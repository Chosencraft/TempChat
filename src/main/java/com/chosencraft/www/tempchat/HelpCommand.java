package com.chosencraft.www.tempchat;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        String format = ChatColor.AQUA + " [G] " + ChatColor.GOLD + "[ " + ChatColor.RESET +"%s " + ChatColor.GOLD + "] " + ChatColor.AQUA +"%s";

        if (!(commandSender instanceof Player))
        {
            return false;
        }

        else
        {
            Player player = (Player) commandSender;
            String msg = "";

            for (String word : strings)
            {
                msg = msg + word;
            }

                    String finalMsg = String.format(format, player.getDisplayName(), msg);

        }

        return true;
    }
}
