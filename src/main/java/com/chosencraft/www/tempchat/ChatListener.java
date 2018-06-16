package com.chosencraft.www.tempchat;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener
{

    @EventHandler (priority = EventPriority.LOWEST)
    public void messageHandler (AsyncPlayerChatEvent chatEvent)
    {
        Player player = chatEvent.getPlayer();

        String format = ChatColor.GREEN + " [G] " + ChatColor.GOLD + "[ " + ChatColor.RESET +"%s " + ChatColor.GOLD + "] " + ChatColor.DARK_GREEN +"%s";

        if (player.hasPermission("group.admin"))
        {
            format = ChatColor.GREEN + " [G] " + ChatColor.GOLD + "[ " + ChatColor.RED +"%s " + ChatColor.GOLD + "] " + ChatColor.DARK_GREEN +"%s";
        }

        for (Player recipient : chatEvent.getRecipients())
        {
            recipient.sendMessage(String.format(format, player.getDisplayName(), chatEvent.getMessage()));
        }

        chatEvent.setCancelled(true);
    }


}
