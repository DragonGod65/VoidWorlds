package net.dragongod65.void_worlds.items;

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

public class GeneralItemManager {

    public static ItemStack warden_scale;

    public static ItemStack ramen;
    public static ItemStack electricgranate;
    public static ItemStack zylinder;
    public static ItemStack architects_hat;
    public static ItemStack boots_of_hat;
    public static ItemStack gravity_orb;
    public static ItemStack book_time;
    public static ItemStack experience_nugget;

    public static ItemStack moss;

    public  static  void init() {

        createWardenScale();
        createRamen();
        createElectricGranate();
        createZylinder();
        createArchitectsHat();
        createBootsofSky();
        createGravityOrb();
        createBookofTime();
        createXPNugget();

        createMoss();

    }
    private static void createWardenScale() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Warden Scale");
        List<String> lore = new ArrayList<>();
        lore.add("§7The Scale of the Deepest Worlds");
        meta.setLore(lore);
        item.setItemMeta(meta);
        warden_scale = item;
    }

    private static void createGravityOrb() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§GravityOrb");
        List<String> lore = new ArrayList<>();
        lore.add("§7Change Gravity with the Power of the Orb");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        gravity_orb = item;
    }
    private static void createBookofTime() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Book of Time");
        List<String> lore = new ArrayList<>();
        lore.add("§7Change the time");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        book_time = item;
    }
    private static void createRamen() {
        ItemStack item = new ItemStack(Material.GOLDEN_CARROT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Ramen");
        List<String> lore = new ArrayList<>();
        lore.add("§7The taste of asia");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ramen = item;
    }
    private static void createElectricGranate() {
        ItemStack item = new ItemStack(Material.SNOWBALL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Electric Granate");
        List<String> lore = new ArrayList<>();
        lore.add("§7Zapping Things");
        meta.setLore(lore);
        item.setItemMeta(meta);
        electricgranate = item;
    }
    private static void createZylinder() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Zylinder");
        List<String> lore = new ArrayList<>();
        lore.add("§7When wearing you get the Luck of Trade");
        meta.setLore(lore);
        item.setItemMeta(meta);
        zylinder = item;
    }
    private static void createArchitectsHat() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Architects Hat");
        List<String> lore = new ArrayList<>();
        lore.add("§Now you are a real Architect");
        meta.setLore(lore);
        item.setItemMeta(meta);
        architects_hat = item;
    }
    private static void createXPNugget() {
        ItemStack item = new ItemStack(Material.GOLD_NUGGET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Nugget of Experience");
        List<String> lore = new ArrayList<>();
        lore.add("§7Triple EXP of a Bottle");
        meta.setLore(lore);
        item.setItemMeta(meta);
        experience_nugget = item;
    }
    private static void createBootsofSky() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Boots of Sky");
        List<String> lore = new ArrayList<>();
        lore.add("§Gives you a douple Jump");
        meta.setLore(lore);
        item.setItemMeta(meta);
        boots_of_hat = item;
    }


    private static void createMoss() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Moss");
        item.setItemMeta(meta);
        moss = item;
    }


}
