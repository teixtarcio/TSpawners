package me.teixtarcio.commands;


import org.bukkit.Bukkit;
import me.teixtarcio.spawners.slime;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tspawnersCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage("Only players can use this command.");
        }

        Player p = (Player) sender;

        //Validando: se o nome do comando (ignorando caixa alta) for "tspawners", ele executará o que há em {}
        if(cmd.getName().equalsIgnoreCase("tspawners")){
        //Recebendo argumentos
            //Se a quantidade de args for igual a 0 = executar o que há em {}
            if(args.length == 0){
                sender.sendMessage(ChatColor.GREEN + "[TSpawners v0.0.1]");
                sender.sendMessage("");
                sender.sendMessage(ChatColor.GRAY + "/tspawner give <player> <spawner_type> <amount>" + ChatColor.GREEN + ", to give a tspawner.");
                sender.sendMessage(ChatColor.GRAY + "/tspawner reload" + ChatColor.GREEN + ", to reload the plugin.");
                return true;
            }

            //Se
            else if(args[0].equalsIgnoreCase("give")){
                p.getInventory().addItem(slime.slimeSpawner);
                sender.sendMessage("teste");
            }
        }



        return false;
    }
}
