package net.dragongod65.void_worlds.items;

import net.dragongod65.void_worlds.items.ores.MythrilItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ToolsAndWeaponsManager {

    public static ItemStack mystical_wood_sword;
    public static ItemStack mystical_wood_pickaxe;
    public static ItemStack mystical_wood_axe;
    public static ItemStack mystical_wood_shovel;
    public static ItemStack mystical_wood_hoe;
    public static ItemStack mystical_wood_bow;

    public static ItemStack echo_sword;
    public static ItemStack echo_pickaxe;
    public static ItemStack echo_axe;
    public static ItemStack echo_shovel;
    public static ItemStack echo_hoe;
    public static ItemStack sculk_bow;

    public static ItemStack mythrilic_iron_sword;
    public static ItemStack mythrilic_iron_pickaxe;
    public static ItemStack mythrilic_iron_axe;
    public static ItemStack mythrilic_iron_shovel;
    public static ItemStack mythrilic_iron_hoe;


    public  static  void init() {
        createMysticalWoodSword();
        createMysticalWoodPickaxe();
        createMysticalWoodAxe();
        createMysticalWoodShovel();
        createMysticalWoodHoe();
        createMysticalWoodBow();

        createEchoSword();
        createEchoPickaxe();
        createEchoAxe();
        createEchoShovel();
        createEchoHoe();
        createSculkBow();

        createMythrilicIronSword();
        createMythrilicIronPickaxe();
        createMythrilicIronAxe();
        createMythrilicIronShovel();
        createMythrilicIronHoe();

    }

    //Mystical Wooden Tools and Weapons
    private static void createMysticalWoodSword() {
        ItemStack item = new ItemStack(Material.WOODEN_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Mystical Wooden Sword");
        mystical_wood_sword = item;
    }
    private static void createMysticalWoodPickaxe() {
        ItemStack item = new ItemStack(Material.WOODEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Mystical Wooden Pickaxe");
        mystical_wood_pickaxe = item;
    }
    private static void createMysticalWoodAxe() {
        ItemStack item = new ItemStack(Material.WOODEN_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Mystical Wooden Axe");
        mystical_wood_axe = item;
    }
    private static void createMysticalWoodShovel() {
        ItemStack item = new ItemStack(Material.WOODEN_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Mystical Wooden Shovel");
        mystical_wood_shovel = item;
    }
    private static void createMysticalWoodHoe() {
        ItemStack item = new ItemStack(Material.WOODEN_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Mystical Wooden Hoe");
        mystical_wood_hoe = item;
    }
    private static void createMysticalWoodBow() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Mystical Wooden Hoe");
        mystical_wood_bow = item;
    }

    private static void createEchoSword() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Echo Sword");
        List<String> lore = new ArrayList<>();
        lore.add("§7A Sword from the Deepest Place of Minecraft");
        meta.setLore(lore);
        item.setItemMeta(meta);
        echo_sword = item;

        //Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("echo_sword"), item);
        sr.shape("XCX", "YAY", "BCB");
        sr.setIngredient('X', Material.COBBLED_DEEPSLATE);
        sr.setIngredient('Y', Material.ECHO_SHARD);
        sr.setIngredient('A', Material.NETHERITE_SWORD);
        sr.setIngredient('B', Material.SCULK_VEIN);
        sr.setIngredient('C', Material.SCULK_SENSOR);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createEchoPickaxe() {
        ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Echo Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A Pickaxe from the Deepest Place of Minecraft");
        meta.setLore(lore);
        item.setItemMeta(meta);
        echo_pickaxe = item;

        //Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("echo_pickaxe"), item);
        sr.shape("XCX", "YAY", "BCB");
        sr.setIngredient('X', Material.COBBLED_DEEPSLATE);
        sr.setIngredient('Y', Material.ECHO_SHARD);
        sr.setIngredient('A', Material.NETHERITE_PICKAXE);
        sr.setIngredient('B', Material.SCULK_VEIN);
        sr.setIngredient('C', Material.SCULK_SENSOR);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createEchoAxe() {
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Echo Axe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A Axe from the Deepest Place of Minecraft");
        meta.setLore(lore);
        item.setItemMeta(meta);
        echo_axe = item;

        //Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("echo_axe"), item);
        sr.shape("XCX", "YAY", "BCB");
        sr.setIngredient('X', Material.COBBLED_DEEPSLATE);
        sr.setIngredient('Y', Material.ECHO_SHARD);
        sr.setIngredient('A', Material.NETHERITE_AXE);
        sr.setIngredient('B', Material.SCULK_VEIN);
        sr.setIngredient('C', Material.SCULK_SENSOR);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createEchoShovel() {
        ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Echo Shovel");
        List<String> lore = new ArrayList<>();
        lore.add("§7A Shovel from the Deepest Place of Minecraft");
        meta.setLore(lore);
        item.setItemMeta(meta);
        echo_shovel = item;

        //Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("echo_shovel"), item);
        sr.shape("XCX", "YAY", "BCB");
        sr.setIngredient('X', Material.COBBLED_DEEPSLATE);
        sr.setIngredient('Y', Material.ECHO_SHARD);
        sr.setIngredient('A', Material.NETHERITE_SHOVEL);
        sr.setIngredient('B', Material.SCULK_VEIN);
        sr.setIngredient('C', Material.SCULK_SENSOR);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createEchoHoe() {
        ItemStack item = new ItemStack(Material.NETHERITE_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Echo Hoe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A Hoe from the Deepest Place of Minecraft");
        meta.setLore(lore);
        item.setItemMeta(meta);
        echo_hoe = item;

        //Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("echo_hoe"), item);
        sr.shape("XCX", "YAY", "BCB");
        sr.setIngredient('X', Material.COBBLED_DEEPSLATE);
        sr.setIngredient('Y', Material.ECHO_SHARD);
        sr.setIngredient('A', Material.NETHERITE_HOE);
        sr.setIngredient('B', Material.SCULK_VEIN);
        sr.setIngredient('C', Material.SCULK_SENSOR);
        Bukkit.getServer().addRecipe(sr);
    }
    private static void createSculkBow() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Sculk Bow");
        List<String> lore = new ArrayList<>();
        lore.add("§7A Bow from the Deepest Place of Minecraft");
        meta.setLore(lore);
        item.setItemMeta(meta);
        sculk_bow = item;

        //Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("sculk_bow"), item);
        sr.shape("XCX", "YAY", "BCB");
        sr.setIngredient('X', Material.COBBLED_DEEPSLATE);
        sr.setIngredient('Y', Material.ECHO_SHARD);
        sr.setIngredient('A', Material.BOW);
        sr.setIngredient('B', Material.SCULK_VEIN);
        sr.setIngredient('C', Material.SCULK_SENSOR);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createMythrilicIronSword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Mythrilic Iron Sword");

        item.setItemMeta(meta);
        mythrilic_iron_sword = item;

        //Recipe
        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_sword"),
                mythrilic_iron_sword, new RecipeChoice.MaterialChoice(Material.IRON_HELMET),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
    private static void createMythrilicIronPickaxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Mythrilic Iron Pickaxe");

        item.setItemMeta(meta);
        mythrilic_iron_pickaxe = item;

        //Recipe
        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_pickaxe"),
                mythrilic_iron_pickaxe, new RecipeChoice.MaterialChoice(Material.IRON_HELMET),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
    private static void createMythrilicIronAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Mythrilic Iron Axe");

        item.setItemMeta(meta);
        mythrilic_iron_axe = item;

        //Recipe
        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_axe"),
                mythrilic_iron_axe, new RecipeChoice.MaterialChoice(Material.IRON_HELMET),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
    private static void createMythrilicIronShovel() {
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Mythrilic Iron Shovel");

        item.setItemMeta(meta);
        mythrilic_iron_shovel = item;

        //Recipe
        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_shovel"),
                mythrilic_iron_shovel, new RecipeChoice.MaterialChoice(Material.IRON_HELMET),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
    private static void createMythrilicIronHoe() {
        ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Mythrilic Iron Hoe");

        item.setItemMeta(meta);
        mythrilic_iron_hoe = item;

        //Recipe
        SmithingRecipe sr = new SmithingRecipe(NamespacedKey.minecraft("mythrilic_iron_hoe"),
                mythrilic_iron_hoe, new RecipeChoice.MaterialChoice(Material.IRON_HELMET),
                new RecipeChoice.ExactChoice(MythrilItemManager.mythril_ingot));
    }
}
