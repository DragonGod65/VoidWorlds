package net.dragongod65.void_worlds.armor;

import net.dragongod65.void_worlds.items.ores.CrystallManager;
import net.dragongod65.void_worlds.items.ores.MythrilItemManager;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class CrystaliteArmorManager {

    public static ItemStack crystalite_helmet;
    public static ItemStack crystalite_chestplate;
    public static ItemStack crystalite_leggings;
    public static ItemStack crystalite_boots;

    public  static  void init() {
        createCrystaliteHelmet();
        createCrystaliteChestplate();
        createCrystaliteLeggings();
        createCrystaliteBoots();

    }


    private static void createCrystaliteHelmet() {
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Crystalite Helmet");
        item.setItemMeta(meta);
        crystalite_helmet = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("crystalite_helmet"),
                crystalite_helmet, new RecipeChoice.ExactChoice(MythrilicIronArmorManager.mythrilic_iron_helmet),
                new RecipeChoice.ExactChoice(CrystallManager.aurora_crystal));
    }
    private static void createCrystaliteChestplate() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Crystalite Chestplate");
        item.setItemMeta(meta);
        crystalite_chestplate = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("crystalite_chestplate"),
                crystalite_chestplate, new RecipeChoice.ExactChoice(MythrilicIronArmorManager.mythrilic_iron_chestplate),
                new RecipeChoice.ExactChoice(CrystallManager.aurora_crystal));
    }
    private static void createCrystaliteLeggings() {
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Crystalite Leggings");
        item.setItemMeta(meta);
        crystalite_leggings = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("crystalite_leggings"),
                crystalite_leggings, new RecipeChoice.ExactChoice(MythrilicIronArmorManager.mythrilic_iron_leggings),
                new RecipeChoice.ExactChoice(CrystallManager.aurora_crystal));
    }
    private static void createCrystaliteBoots() {
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Crystalite Boots");
        item.setItemMeta(meta);
        crystalite_boots = item;

        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("crystalite_boots"),
                crystalite_boots, new RecipeChoice.ExactChoice(MythrilicIronArmorManager.mythrilic_iron_boots),
                new RecipeChoice.ExactChoice(CrystallManager.aurora_crystal));
    }

}
