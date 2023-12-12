package net.marco.Marco_mod.item;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.item.custom.FuelItem;
import net.minecraft.world.item.Item;
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
    public static final RegistryObject<Item>  ETERNAL_FLAME = ITEMS.register("eternal_flame", () -> new FuelItem(new Item.Properties(), 65536));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
