package us.kpvpdev.kkitslite.commands.kits;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

import us.kpvpdev.kkitslite.kits.Kits;
import us.kpvpdev.kkitslite.utils.Chat;

public class PvP implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player && args.length >= 0) {
            Player player = (Player)sender;

            if(player.hasPermission("kkitslite.kits.pvp")) {
                Kits.pvp.giveKit(player);
            }
            else {
                Chat.noKitPerms(sender, "PvP");
            }

            return true;
        }

        return false;
    }

}