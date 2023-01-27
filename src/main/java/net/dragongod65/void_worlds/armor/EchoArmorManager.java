package net.dragongod65.void_worlds.armor;

import net.dragongod65.void_worlds.items.GeneralItemManager;
import net.dragongod65.void_worlds.items.ores.MythrilItemManager;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class EchoArmorManager {

    public static ItemStack echo_helmet;
    public static ItemStack echo_chestplate;
    public static ItemStack echo_leggings;
    public static ItemStack echo_boots;

    public  static  void init() {
        createEchoHelmet();
        createEchoChestplate();
        createEchoLeggings();
        createEchoBoots();

    }


    private static void createEchoHelmet() {
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Echo Helmet");
        item.setItemMeta(meta);
        echo_helmet = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("echo_helmet"),
                echo_helmet, new RecipeChoice.MaterialChoice(Material.NETHERITE_HELMET),
                new RecipeChoice.ExactChoice(GeneralItemManager.warden_scale));
    }
    private static void createEchoChestplate() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Echo Chestplate");
        item.setItemMeta(meta);
        echo_chestplate = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("echo_chestplate"),
                echo_chestplate, new RecipeChoice.MaterialChoice(Material.NETHERITE_CHESTPLATE),
                new RecipeChoice.ExactChoice(GeneralItemManager.warden_scale));
    }
    private static void createEchoLeggings() {
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Echo Leggings");
        item.setItemMeta(meta);
        echo_leggings = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("echo_leggings"),
                echo_leggings, new RecipeChoice.MaterialChoice(Material.NETHERITE_LEGGINGS),
                new RecipeChoice.ExactChoice(GeneralItemManager.warden_scale));
    }
    private static void createEchoBoots() {
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Echo Boots");
        item.setItemMeta(meta);
        echo_boots = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("echo_boots"),
                echo_boots, new RecipeChoice.MaterialChoice(Material.NETHERITE_BOOTS),
                new RecipeChoice.ExactChoice(GeneralItemManager.warden_scale));
    }

}
