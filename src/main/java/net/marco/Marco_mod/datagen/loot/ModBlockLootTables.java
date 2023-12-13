package net.marco.Marco_mod.datagen.loot;

import net.marco.Marco_mod.block.ModBlocks;
import net.marco.Marco_mod.item.Moditems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
    this.dropSelf(ModBlocks.RUBY_BLOCK.get());
    this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
    this.add(ModBlocks.SAPPHIRE_ORE.get(), block
        -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), Moditems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.RUBY_ORE.get(), block
                -> createOreDrop(ModBlocks.RUBY_ORE.get(), Moditems.RAW_RUBY.get()));
        this.dropSelf(ModBlocks.RUBY_STAIRS.get());
        this.dropSelf(ModBlocks.RUBY_BUTTON.get());
        this.dropSelf(ModBlocks.RUBY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RUBY_FENCE.get());
        this.dropSelf(ModBlocks.RUBY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RUBY_WALL.get());
        this.dropSelf(ModBlocks.RUBY_TRAPDOOR.get());

        this.add(ModBlocks.RUBY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBY_SLAB.get()));
        this.add(ModBlocks.RUBY_DOOR.get(),
                block -> createDoorTable(ModBlocks.RUBY_DOOR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
