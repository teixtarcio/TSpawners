package me.teixtarcio.spawners;

import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.EntityType;
import java.util.ArrayList;
import java.util.List;

public class slime extends JavaPlugin{

    public static ItemStack slimeSpawner;

    public static void init(){ slimeSpawner();
    }

    private static void slimeSpawner(){
        ItemStack item = new ItemStack(Material.SPAWNER);
        BlockStateMeta meta = (BlockStateMeta) item.getItemMeta();

        meta.setDisplayName("test");
        List<String> lore = new ArrayList<>();
        lore.add("&eSlime Spawner");
        meta.setLore(lore);


        CreatureSpawner spawner = (CreatureSpawner) meta.getBlockState();
        spawner.setSpawnedType(EntityType.SLIME);
        meta.setBlockState(spawner);
        item.setItemMeta(meta);

        slimeSpawner = item;

    }
}
