package net.dragongod65.void_worlds.items.wood;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class LeavesItemManager {

    //Vanilla
    public static ItemStack oak_leaf;
    public static ItemStack spruce_leaf;
    public static ItemStack birch_leaf;
    public static ItemStack jungle_leaf;
    public static ItemStack acacia_leaf;
    public static ItemStack dark_oak_leaf;
    public static ItemStack mangrove_leaf;

    public static ItemStack aether_spruce_leaf;
    public static ItemStack fir_leaf;
    public static ItemStack mystic_oak_leaf;
    public static ItemStack mythril_infested_fir_leaf;
    public static ItemStack wisteria_leaf;

    public static ItemStack dead_leaf;
    public static ItemStack tea_leaf;



    public static void init() {
        createOakLeaf();
        createSpruceLeaf();
        createBirchLeaf();
        createJungleLeaf();
        createAcaciaLeaf();
        createDarkOakLeaf();
        createMangroveLeaf();

        createAetherSpruceLeaf();
        createFirLeaf();
        createMysticOakLeaf();
        createMythrilInfestedFirLeaf();
        createWisteriaLeaf();

        createDeadLeaf();
        createTeaLeaf();
    }

    private static void createOakLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Oak Leaf");
        item.setItemMeta(meta);
        oak_leaf = item;
    }
    private static void createSpruceLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Oak Leaf");
        item.setItemMeta(meta);
        spruce_leaf = item;
    }
    private static void createBirchLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Oak Leaf");
        item.setItemMeta(meta);
        birch_leaf = item;
    }
    private static void createJungleLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Oak Leaf");
        item.setItemMeta(meta);
        jungle_leaf = item;
    }
    private static void createAcaciaLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Oak Leaf");
        item.setItemMeta(meta);
        acacia_leaf = item;
    }
    private static void createDarkOakLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Oak Leaf");
        item.setItemMeta(meta);
        dark_oak_leaf = item;
    }
    private static void createMangroveLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Oak Leaf");
        item.setItemMeta(meta);
        mangrove_leaf = item;
    }

    private static void createAetherSpruceLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Aether Spruce Leaf");
        item.setItemMeta(meta);
        aether_spruce_leaf = item;
    }
    private static void createFirLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Fir Leaf");
        item.setItemMeta(meta);
        fir_leaf = item;
    }
    private static void createMysticOakLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mystic Oak Leaf");
        item.setItemMeta(meta);
        mystic_oak_leaf = item;
    }
    private static void createMythrilInfestedFirLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Mythril Infested Fir Leaf");
        item.setItemMeta(meta);
        mythril_infested_fir_leaf = item;
    }
    private static void createWisteriaLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Wisteria Leaf");
        item.setItemMeta(meta);
        wisteria_leaf = item;
    }

    private static void createDeadLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Dead Leaf");
        item.setItemMeta(meta);
        dead_leaf = item;
    }
    private static void createTeaLeaf() {
        ItemStack item = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Tea Leaf");
        item.setItemMeta(meta);
        tea_leaf = item;
    }
}
