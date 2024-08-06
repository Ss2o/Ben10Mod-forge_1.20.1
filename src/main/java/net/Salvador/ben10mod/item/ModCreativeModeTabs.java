package net.Salvador.ben10mod.item;

import net.Salvador.ben10mod.Ben10Mod;
import net.Salvador.ben10mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ben10Mod.MOD_ID);


    /* v TABS v */

    public static final RegistryObject<CreativeModeTab> BEM_10_TAB = CREATIVE_MODE_TABS.register("ben_10_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OMNITRIX.get()))
                    .title(Component.translatable("creativetab.ben_10_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.OMNITRIX.get());

                        pOutput.accept(ModBlocks.TEST_BLOCK.get());



                    })
                    .build());

    /* ^ TABS ^ */


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
