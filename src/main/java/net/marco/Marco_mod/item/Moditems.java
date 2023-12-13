package net.marco.Marco_mod.item;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.item.custom.FuelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Marco_mod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () -> new Item(new Item.Properties().food(ModFoods.HAMBURGER)));

    public static final RegistryObject<Item> RUBY_WAND = ITEMS.register("ruby_wand", () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item>  ETERNAL_FLAME = ITEMS.register("eternal_flame", () -> new FuelItem(new Item.Properties(), 65536));
    public static final RegistryObject<Item>  RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModToolTiers.RUBY, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item>  RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBY, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item>  RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModToolTiers.RUBY, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item>  RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModToolTiers.RUBY, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item>  RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModToolTiers.RUBY, 4, 2, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
