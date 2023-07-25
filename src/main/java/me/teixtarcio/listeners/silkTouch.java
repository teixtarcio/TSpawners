package me.teixtarcio.listeners;

import io.papermc.paper.event.block.BlockBreakBlockEvent;
import me.teixtarcio.TSpawners;
import me.teixtarcio.spawners.slime;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class silkTouch implements Listener {

    private final TSpawners plugin;

    public silkTouch(TSpawners plugin){
        this.plugin = plugin;
    }


    @EventHandler
    public void onBreakSpawner(BlockBreakEvent e){


        ItemStack slimeSpawner = slime.slimeSpawner;

        Block block = e.getBlock();

        boolean silkTouch = this.plugin.getConfig().getBoolean("silk-touch");
        String successfullyBroken = this.plugin.getConfig().getString("successfullyBroken");
        String wronglyBroken = this.plugin.getConfig().getString("wronglyBroken");


        if(silkTouch){
            if(e.getBlock().getType() == Material.SPAWNER) {
                CreatureSpawner spawner = (CreatureSpawner) block.getState();
                EntityType entityType = spawner.getSpawnedType();

                //Creeper Spawner
                if (entityType == EntityType.CREEPER) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Skelleton Spawner
                if (entityType == EntityType.SKELETON) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Spider Spawner
                if (entityType == EntityType.SPIDER) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Zombie spawner
                if (entityType == EntityType.ZOMBIE) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Slime Spawner
                if (entityType == EntityType.SLIME) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Pig Zombie Spawner
                if (entityType == EntityType.ZOMBIFIED_PIGLIN) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Blaze Spawner
                if (entityType == EntityType.BLAZE) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Sheep Spawner
                if (entityType == EntityType.SHEEP) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Cow Spawner
                if (entityType == EntityType.COW) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Chicken Spawner
                if (entityType == EntityType.CHICKEN) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }

                //Iron Golem Spawner
                if (entityType == EntityType.IRON_GOLEM) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        if (successfullyBroken != null) {
                            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', successfullyBroken));
                            e.getPlayer().getInventory().addItem(slimeSpawner);
                        }
                    } else if (wronglyBroken != null) {
                        e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', wronglyBroken));
                        e.setDropItems(false);
                    }
                }



            }
    }
    }

}
