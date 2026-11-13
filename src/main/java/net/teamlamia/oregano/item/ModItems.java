package net.teamlamia.oregano.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.teamlamia.oregano.Oregano;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Oregano.MOD_ID);

    public static final DeferredItem<Item> ALMOND = ITEMS.register("almond",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YOGHURT = ITEMS.register("yoghurt",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }
}
