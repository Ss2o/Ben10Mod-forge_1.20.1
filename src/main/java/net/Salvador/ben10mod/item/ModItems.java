package net.Salvador.ben10mod.item;

import net.Salvador.ben10mod.Ben10Mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ben10Mod.MOD_ID);


    /* v ITEMS v */

    public static final RegistryObject<Item> OMNITRIX = ITEMS.register("omnitrix",
            () -> new Item(new Item.Properties()));

    /* ^ ITEMS ^ */


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
