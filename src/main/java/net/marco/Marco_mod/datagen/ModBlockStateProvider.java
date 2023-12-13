package net.marco.Marco_mod.datagen;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Marco_mod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    blockWithItem(ModBlocks.RUBY_BLOCK);
    blockWithItem(ModBlocks.RUBY_ORE);
    blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
    blockWithItem(ModBlocks.SAPPHIRE_ORE);

    stairsBlock(((StairBlock) ModBlocks.RUBY_STAIRS.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
    slabBlock(((SlabBlock) ModBlocks.RUBY_SLAB.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));

    buttonBlock(((ButtonBlock) ModBlocks.RUBY_BUTTON.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
    pressurePlateBlock(((PressurePlateBlock) ModBlocks.RUBY_PRESSURE_PLATE.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
    fenceBlock(((FenceBlock) ModBlocks.RUBY_FENCE.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
    fenceGateBlock(((FenceGateBlock) ModBlocks.RUBY_FENCE_GATE.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
    wallBlock(((WallBlock) ModBlocks.RUBY_WALL.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
    doorBlockWithRenderType(((DoorBlock) ModBlocks.RUBY_DOOR.get()), modLoc("block/ruby_door_bottem"), modLoc("block/ruby_door_top"), "cutout");
    trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.RUBY_TRAPDOOR.get()), modLoc("block/ruby_trapdoor"), true, "cutout");









    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

    }
}
