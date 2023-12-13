package net.marco.Marco_mod.datagen;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.block.ModBlocks;
import net.marco.Marco_mod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Marco_mod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_ORE.get(),
                ModBlocks.RUBY_ORE.get(),
                ModBlocks.RUBY_BLOCK.get(),
                ModBlocks.SAPPHIRE_BLOCK.get(),
                ModBlocks.RUBY_STAIRS.get(),
                ModBlocks.RUBY_SLAB.get(),
                ModBlocks.RUBY_PRESSURE_PLATE.get(),
                ModBlocks.RUBY_FENCE_GATE.get(),
                ModBlocks.RUBY_FENCE.get(),
                ModBlocks.RUBY_WALL.get(),
                ModBlocks.RUBY_TRAPDOOR.get(),
                ModBlocks.RUBY_DOOR.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SAPPHIRE_ORE.get(),
                ModBlocks.RUBY_ORE.get(),
                ModBlocks.RUBY_BLOCK.get(),
                ModBlocks.SAPPHIRE_BLOCK.get(),
                ModBlocks.RUBY_STAIRS.get(),
                ModBlocks.RUBY_SLAB.get(),
                ModBlocks.RUBY_PRESSURE_PLATE.get(),
                ModBlocks.RUBY_FENCE_GATE.get(),
                ModBlocks.RUBY_FENCE.get(),
                ModBlocks.RUBY_WALL.get(),
                ModBlocks.RUBY_TRAPDOOR.get(),
                ModBlocks.RUBY_DOOR.get());



        this.tag(BlockTags.FENCES).add(ModBlocks.RUBY_FENCE.get());

        this.tag(BlockTags.FENCE_GATES).add(ModBlocks.RUBY_FENCE_GATE.get());

        this.tag(BlockTags.WALLS).add(ModBlocks.RUBY_WALL.get());
    }

}
