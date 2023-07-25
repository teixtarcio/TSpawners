package me.teixtarcio.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Player;
import me.teixtarcio.spawners.slime;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class placingSpawners implements Listener {

    @EventHandler
    public void placingSpawner(BlockPlaceEvent e){

        Player p = e.getPlayer();
        ItemStack slimeSpawner = slime.slimeSpawner;

        //Slime Spawner
        if(p.getInventory().getItemInHand().isSimilar(slimeSpawner)){

            Block bloco = e.getBlockPlaced();
            Location loc = bloco.getLocation();

            double x = loc.getX();
            double y = loc.getY();
            double z = loc.getZ();

            if(e.getBlockPlaced() == loc){
                p.sendMessage("A localização é a mesma.");
            } else {
                p.sendMessage("ok");
            }



        }



        if(p.getInventory().getItemInOffHand().isSimilar(slimeSpawner)){
            p.sendMessage("Item colocado com offhand.");
        }
    }
}
