package net.marco.Marco_mod.datagen;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.block.ModBlocks;
import net.marco.Marco_mod.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTING = List.of(Moditems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get());
    private static final List<ItemLike> RUBY_SMELTING = List.of(Moditems.RAW_RUBY.get(),
            ModBlocks.RUBY_ORE.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
    oreBlasting(pRecipeOutput, SAPPHIRE_SMELTING, RecipeCategory.MISC, Moditems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
    oreBlasting(pRecipeOutput, RUBY_SMELTING, RecipeCategory.MISC, Moditems.RUBY.get(), 0.25f, 100, "ruby");
    oreSmelting(pRecipeOutput, SAPPHIRE_SMELTING, RecipeCategory.MISC, Moditems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
    oreSmelting(pRecipeOutput, RUBY_SMELTING, RecipeCategory.MISC, Moditems.RUBY.get(), 0.25f, 200, "ruby");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pRecipeOutput);
    }
    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, Marco_mod.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }

    }
}
