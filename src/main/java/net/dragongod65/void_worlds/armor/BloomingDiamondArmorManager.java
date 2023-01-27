package net.dragongod65.void_worlds.armor;

import net.dragongod65.void_worlds.items.wood.LeavesItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class BloomingDiamondArmorManager {

    public static ItemStack blooming_diamond_helmet;
    public static ItemStack blooming_diamond_chestplate;
    public static ItemStack blooming_diamond_leggings;
    public static ItemStack blooming_diamond_boots;

    public  static  void init() {
        createBloomingDiamondHelmet();
        createBloomingDiamondChestplate();
        createBloomingDiamondLeggings();
        createBloomingDiamondBoots();

    }


    private static void createBloomingDiamondHelmet() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Blooming Diamond Helmet");
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        blooming_diamond_helmet = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("blooming_diamond_helmet"), item);
        sr.shape("XYB", "YAY", "BYX");
        sr.setIngredient('X', Material.EMERALD);
        sr.setIngredient('Y', LeavesItemManager.wisteria_leaf);
        sr.setIngredient('A', Material.DIAMOND_HELMET);
        sr.setIngredient('B', Material.REDSTONE);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createBloomingDiamondChestplate() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Blooming Diamond Chestplate");
        meta.setCustomModelData(2);
        item.setItemMeta(meta);
        blooming_diamond_chestplate = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("blooming_diamond_chestplate"), item);
        sr.shape("XYB", "YAY", "BYX");
        sr.setIngredient('X', Material.EMERALD);
        sr.setIngredient('Y', LeavesItemManager.wisteria_leaf);
        sr.setIngredient('A', Material.DIAMOND_CHESTPLATE);
        sr.setIngredient('B', Material.REDSTONE);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createBloomingDiamondLeggings() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Blooming Diamond Leggings");
        meta.setCustomModelData(3);
        item.setItemMeta(meta);
        blooming_diamond_leggings = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("blooming_diamond_leggings"), item);
        sr.shape("XYB", "YAY", "BYX");
        sr.setIngredient('X', Material.EMERALD);
        sr.setIngredient('Y', LeavesItemManager.wisteria_leaf);
        sr.setIngredient('A', Material.DIAMOND_LEGGINGS);
        sr.setIngredient('B', Material.REDSTONE);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createBloomingDiamondBoots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Blooming Diamond Boots");
        meta.setCustomModelData(4);
        item.setItemMeta(meta);
        blooming_diamond_boots = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("blooming_diamond_boots"), item);
        sr.shape("XYB", "YAY", "BYX");
        sr.setIngredient('X', Material.EMERALD);
        sr.setIngredient('Y', LeavesItemManager.wisteria_leaf);
        sr.setIngredient('A', Material.DIAMOND_BOOTS);
        sr.setIngredient('B', Material.REDSTONE);
        Bukkit.getServer().addRecipe(sr);
    }

}
