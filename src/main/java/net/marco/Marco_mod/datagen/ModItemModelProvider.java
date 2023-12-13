package net.marco.Marco_mod.datagen;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.block.ModBlocks;
import net.marco.Marco_mod.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Marco_mod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    simpleItem(Moditems.RUBY);
    simpleItem(Moditems.RAW_RUBY);
    simpleItem(Moditems.SAPPHIRE);
    simpleItem(Moditems.RAW_SAPPHIRE);
    simpleItem(Moditems.HAMBURGER);
    simpleItem(Moditems.ETERNAL_FLAME);

    simpleBlockItem(ModBlocks.RUBY_DOOR);
    fenceItem(ModBlocks.RUBY_FENCE, ModBlocks.RUBY_BLOCK);
    buttonItem(ModBlocks.RUBY_BUTTON, ModBlocks.RUBY_BLOCK);
    wallItem(ModBlocks.RUBY_WALL, ModBlocks.RUBY_BLOCK);

    evenSimplerBlockItem(ModBlocks.RUBY_STAIRS);
    evenSimplerBlockItem(ModBlocks.RUBY_SLAB);
    evenSimplerBlockItem(ModBlocks.RUBY_PRESSURE_PLATE);
    evenSimplerBlockItem(ModBlocks.RUBY_FENCE_GATE);

    trapdoorItem(ModBlocks.RUBY_TRAPDOOR);


    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Marco_mod.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Marco_mod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Marco_mod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Marco_mod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Marco_mod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Marco_mod.MOD_ID,"item/" + item.getId().getPath()));
    }


}
