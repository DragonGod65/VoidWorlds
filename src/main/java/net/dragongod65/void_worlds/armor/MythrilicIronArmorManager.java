package net.dragongod65.void_worlds.armor;

import net.dragongod65.void_worlds.items.ores.MythrilItemManager;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

public class MythrilicIronArmorManager {

    public static ItemStack mythrilic_iron_helmet;
    public static ItemStack mythrilic_iron_chestplate;
    public static ItemStack mythrilic_iron_leggings;
    public static ItemStack mythrilic_iron_boots;

    public  static  void init() {
        createMythrilicIronHelmet();
        createMythrilicIronChestplate();
        createMythrilicIronLeggings();
        createMythrilicIronBoots();

    }


    private static void createMythrilicIronHelmet() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythrilic Iron Helmet");
        item.setItemMeta(meta);
        mythrilic_iron_helmet = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_helmet"),
                mythrilic_iron_helmet, new RecipeChoice.MaterialChoice(Material.IRON_HELMET),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
    private static void createMythrilicIronChestplate() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythrilic Iron Chestplate");
        item.setItemMeta(meta);
        mythrilic_iron_chestplate = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_chestplate"),
                mythrilic_iron_chestplate, new RecipeChoice.MaterialChoice(Material.IRON_CHESTPLATE),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
    private static void createMythrilicIronLeggings() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythrilic Iron Leggings");
        item.setItemMeta(meta);
        mythrilic_iron_leggings = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_leggings"),
                mythrilic_iron_leggings, new RecipeChoice.MaterialChoice(Material.IRON_LEGGINGS),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
    private static void createMythrilicIronBoots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythrilic Iron Boots");
        item.setItemMeta(meta);
        mythrilic_iron_boots = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_boots"),
                mythrilic_iron_boots, new RecipeChoice.MaterialChoice(Material.IRON_BOOTS),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }

}
