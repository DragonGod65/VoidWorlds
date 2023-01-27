package net.dragongod65.void_worlds.blocks.ores;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MythrilBlockManager {

    public static ItemStack eg;


    public static ItemStack moss;

    public  static  void init() {
        createeg();


    }


    private static void createeg() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythril Ingot");

        item.setItemMeta(meta);
        eg = item;
    }


}
