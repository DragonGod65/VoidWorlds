package net.dragongod65.void_worlds.blocks.wood;

import com.destroystokyo.paper.block.BlockSoundGroup;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import org.bukkit.util.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

public class MysticOakWoodenBlockSetManager {

    public static Block mystical_oak_log;
    public static Block mystical_oak_wood;
    public static Block stripped_mystical_oak_log;
    public static Block stripped_mystical_oak_wood;

    public static Block mystical_oak_wood_planks;
    public static Block mystical_oak_wood_pressure_plate;
    public static Block mystical_oak_wood_stair;
    public static Block mystical_oak_wood_slab;
    public static Block mystical_oak_wood_button;
    public static Block mystical_oak_wood_fence;
    public static Block mystical_oak_wood_fence_gate;
    public static Block mystical_oak_wood_sign;
    public static Block mystical_oak_wood_boat;



    public static void init() {
        createMysticalOakLog();
    }
    private static void createMysticalOakLog() {
        Block block = new Block() {
            @Override
            public byte getData() {
                return 0;
            }

            @Override
            public @NotNull BlockData getBlockData() {
                return null;
            }

            @Override
            public @NotNull Block getRelative(int modX, int modY, int modZ) {
                return null;
            }

            @Override
            public @NotNull Block getRelative(@NotNull BlockFace face) {
                return null;
            }

            @Override
            public @NotNull Block getRelative(@NotNull BlockFace face, int distance) {
                return null;
            }

            @Override
            public @NotNull Material getType() {
                return null;
            }

            @Override
            public byte getLightLevel() {
                return 0;
            }

            @Override
            public byte getLightFromSky() {
                return 0;
            }

            @Override
            public byte getLightFromBlocks() {
                return 0;
            }

            @Override
            public @NotNull World getWorld() {
                return null;
            }

            @Override
            public int getX() {
                return 0;
            }

            @Override
            public int getY() {
                return 0;
            }

            @Override
            public int getZ() {
                return 0;
            }

            @Override
            public boolean isValidTool(@NotNull ItemStack itemStack) {
                return false;
            }

            @Override
            public @NotNull Location getLocation() {
                return null;
            }

            @Override
            public @Nullable Location getLocation(@Nullable Location loc) {
                return null;
            }

            @Override
            public @NotNull Chunk getChunk() {
                return null;
            }

            @Override
            public void setBlockData(@NotNull BlockData data) {

            }

            @Override
            public void setBlockData(@NotNull BlockData data, boolean applyPhysics) {

            }

            @Override
            public void setType(@NotNull Material type) {

            }

            @Override
            public void setType(@NotNull Material type, boolean applyPhysics) {

            }

            @Override
            public @Nullable BlockFace getFace(@NotNull Block block) {
                return null;
            }

            @Override
            public @NotNull BlockState getState() {
                return null;
            }

            @Override
            public @NotNull BlockState getState(boolean useSnapshot) {
                return null;
            }

            @Override
            public @NotNull Biome getBiome() {
                return null;
            }

            @Override
            public @NotNull Biome getComputedBiome() {
                return null;
            }

            @Override
            public void setBiome(@NotNull Biome bio) {

            }

            @Override
            public boolean isBlockPowered() {
                return false;
            }

            @Override
            public boolean isBlockIndirectlyPowered() {
                return false;
            }

            @Override
            public boolean isBlockFacePowered(@NotNull BlockFace face) {
                return false;
            }

            @Override
            public boolean isBlockFaceIndirectlyPowered(@NotNull BlockFace face) {
                return false;
            }

            @Override
            public int getBlockPower(@NotNull BlockFace face) {
                return 0;
            }

            @Override
            public int getBlockPower() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean isLiquid() {
                return false;
            }

            @Override
            public boolean isBuildable() {
                return false;
            }

            @Override
            public boolean isBurnable() {
                return false;
            }

            @Override
            public boolean isReplaceable() {
                return false;
            }

            @Override
            public boolean isSolid() {
                return false;
            }

            @Override
            public boolean isCollidable() {
                return false;
            }

            @Override
            public double getTemperature() {
                return 0;
            }

            @Override
            public double getHumidity() {
                return 0;
            }

            @Override
            public @NotNull PistonMoveReaction getPistonMoveReaction() {
                return null;
            }

            @Override
            public boolean breakNaturally() {
                return false;
            }

            @Override
            public boolean breakNaturally(@Nullable ItemStack tool) {
                return false;
            }

            @Override
            public boolean breakNaturally(boolean triggerEffect, boolean dropExperience) {
                return false;
            }

            @Override
            public boolean breakNaturally(@NotNull ItemStack tool, boolean triggerEffect, boolean dropExperience) {
                return false;
            }

            @Override
            public void tick() {

            }

            @Override
            public void randomTick() {

            }

            @Override
            public boolean applyBoneMeal(@NotNull BlockFace face) {
                return false;
            }

            @Override
            public @NotNull Collection<ItemStack> getDrops() {
                return null;
            }

            @Override
            public @NotNull Collection<ItemStack> getDrops(@Nullable ItemStack tool) {
                return null;
            }

            @Override
            public @NotNull Collection<ItemStack> getDrops(@NotNull ItemStack tool, @Nullable Entity entity) {
                return null;
            }

            @Override
            public boolean isPreferredTool(@NotNull ItemStack tool) {
                return false;
            }

            @Override
            public float getBreakSpeed(@NotNull Player player) {
                return 0;
            }

            @Override
            public boolean isPassable() {
                return false;
            }

            @Override
            public @Nullable RayTraceResult rayTrace(@NotNull Location start, @NotNull Vector direction, double maxDistance, @NotNull FluidCollisionMode fluidCollisionMode) {
                return null;
            }

            @Override
            public @NotNull BoundingBox getBoundingBox() {
                return null;
            }

            @Override
            public @NotNull VoxelShape getCollisionShape() {
                return null;
            }

            @Override
            public boolean canPlace(@NotNull BlockData data) {
                return false;
            }

            @Override
            public @NotNull BlockSoundGroup getSoundGroup() {
                return null;
            }

            @Override
            public @NotNull SoundGroup getBlockSoundGroup() {
                return null;
            }

            @Override
            public @NotNull String getTranslationKey() {
                return null;
            }

            @Override
            public @NotNull float getDestroySpeed(@NotNull ItemStack itemStack, boolean considerEnchants) {
                return 0;
            }

            @Override
            public @NotNull String translationKey() {
                return null;
            }

            @Override
            public void setMetadata(@NotNull String metadataKey, @NotNull MetadataValue newMetadataValue) {

            }

            @Override
            public @NotNull List<MetadataValue> getMetadata(@NotNull String metadataKey) {
                return null;
            }

            @Override
            public boolean hasMetadata(@NotNull String metadataKey) {
                return false;
            }

            @Override
            public void removeMetadata(@NotNull String metadataKey, @NotNull Plugin owningPlugin) {

            }
        };
        mystical_oak_log = block;
    }

}
