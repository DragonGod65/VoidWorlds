package net.dragongod65.void_worlds.items.ores;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MythrilItemManager {

    public static ItemStack mythril_ingot;


    public static ItemStack mythril_nugget;

    public  static  void init() {
        createMythrilIngot();
        createMythrilNugget();

    }


    private static void createMythrilIngot() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythril Ingot");
        meta.setCustomModelData(453111);
        item.setItemMeta(meta);
        mythril_ingot = item;
    }


    private static void createMythrilNugget() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythril Nugget");
        meta.setCustomModelData(453112);
        item.setItemMeta(meta);
        mythril_nugget = item;
    }


}
