package net.marco.Marco_mod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class FuelItem extends Item {
    private int BurnTIme = 0;

    public FuelItem(Properties pProperties, int BurnTime) {
        super(pProperties);
        this.BurnTIme = BurnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.BurnTIme;
    }

}
