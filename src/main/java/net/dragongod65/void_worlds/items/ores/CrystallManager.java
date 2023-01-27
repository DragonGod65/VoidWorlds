package net.dragongod65.void_worlds.items.ores;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CrystallManager {


    public static ItemStack aurora_crystal;

    public  static  void init() {
        createAuroraCrystal();


    }


    private static void createAuroraCrystal() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Aurora Crystal");
        meta.setCustomModelData(453111);
        item.setItemMeta(meta);
        aurora_crystal = item;
    }


}
