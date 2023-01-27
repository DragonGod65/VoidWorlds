package net.dragongod65.void_worlds;

import net.dragongod65.void_worlds.armor.BloomingDiamondArmorManager;
import net.dragongod65.void_worlds.armor.CrystaliteArmorManager;
import net.dragongod65.void_worlds.armor.EchoArmorManager;
import net.dragongod65.void_worlds.armor.MythrilicIronArmorManager;
import net.dragongod65.void_worlds.blocks.ores.MythrilBlockManager;
import net.dragongod65.void_worlds.blocks.wood.*;
import net.dragongod65.void_worlds.items.GeneralItemManager;
import net.dragongod65.void_worlds.items.wood.LeavesItemManager;
import net.dragongod65.void_worlds.items.ToolsAndWeaponsManager;
import net.dragongod65.void_worlds.items.ores.MythrilItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Void_worlds extends JavaPlugin {

    @Override
    public void onEnable() {
        //Pure Item Manager

        GeneralItemManager.init();
        ToolsAndWeaponsManager.init();

        //Managers ores
        MythrilItemManager.init(); //model, meta
        MythrilBlockManager.init(); //model, meta


        //Armor Managers
        MythrilicIronArmorManager.init(); //model, meta
        EchoArmorManager.init(); //model, meta
        BloomingDiamondArmorManager.init(); //model, meta
        CrystaliteArmorManager.init(); //model, meta

        //Managers wood
        LeavesItemManager.init(); //model, meta

        AetherSpruceWoodenSet.init(); //model, function, other blocks, meta

        FirWoodenSet.init(); //model, function, other blocks, meta

        MysticOakWoodenBlockSetManager.init(); //model, function, other blocks, meta

        MythrilInfestedFirWoodenSet.init(); //model, function, other blocks, meta

        WisteriaTreeWoodenSet.init(); //model, function, meta




    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
