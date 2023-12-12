package net.marco.Marco_mod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

public static final FoodProperties HAMBURGER = new FoodProperties.Builder().nutrition(2)
        .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200), 0.1f).build();


}
