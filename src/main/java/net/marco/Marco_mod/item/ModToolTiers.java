package net.marco.Marco_mod.item;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_RUBY_TOOL,() -> Ingredient.of(Moditems.RUBY.get())),
            new ResourceLocation(Marco_mod.MOD_ID, "ruby"), List.of(Tiers.NETHERITE), List.of());
}