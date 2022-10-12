package net.sanberdir.lessen.init.items;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sanberdir.lessen.Lessen;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lessen.MOD_ID);

    public static final RegistryObject<Item> FIRE_POT = ITEMS.register("fire_pot",
            () -> new Item( new Item.Properties().group(ModItemsGroup.MOD_ITEMS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
