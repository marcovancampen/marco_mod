package net.marco.Marco_mod.item;

import net.marco.Marco_mod.Marco_mod;
import net.marco.Marco_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Marco_mod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> RESCOURSE_TAB = CREATIVE_MODE_TABS.register("rescourse_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.RUBY.get()))
            .title(Component.translatable("creativetab.ruby_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(Moditems.RUBY.get());
                pOutput.accept(Moditems.SAPPHIRE.get());
                pOutput.accept(Moditems.RAW_SAPPHIRE.get());
                pOutput.accept(Moditems.RAW_RUBY.get());
                pOutput.accept(Moditems.HAMBURGER.get());
                pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                pOutput.accept(ModBlocks.RUBY_ORE.get());
                pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                pOutput.accept(ModBlocks.RUBY_STAIRS.get());
                pOutput.accept(ModBlocks.RUBY_SLAB.get());
                pOutput.accept(ModBlocks.RUBY_BUTTON.get());
                pOutput.accept(ModBlocks.RUBY_PRESSURE_PLATE.get());
                pOutput.accept(ModBlocks.RUBY_FENCE_GATE.get());
                pOutput.accept(ModBlocks.RUBY_FENCE.get());
                pOutput.accept(ModBlocks.RUBY_WALL.get());
                pOutput.accept(ModBlocks.RUBY_DOOR.get());
                pOutput.accept(ModBlocks.RUBY_TRAPDOOR.get());
                pOutput.accept(Moditems.RUBY_WAND.get());
                pOutput.accept(Moditems.RUBY_SWORD.get());
                pOutput.accept(Moditems.RUBY_HOE.get());
                pOutput.accept(Moditems.RUBY_SHOVEL.get());
                pOutput.accept(Moditems.RUBY_PICKAXE.get());
                pOutput.accept(Moditems.RUBY_AXE.get());


            })
            .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
