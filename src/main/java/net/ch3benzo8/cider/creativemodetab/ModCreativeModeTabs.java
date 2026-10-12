package net.ch3benzo8.cider.creativemodetab;

import net.ch3benzo8.cider.Cider;
import net.ch3benzo8.cider.block.ModBlocks;
import net.ch3benzo8.cider.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab CIDER_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Cider.MOD_ID, "cider_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT))
                    .title(Component.translatable("creativemodetab.cider.cider_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.STEEL_INGOT);

                    }).build());

    public static final CreativeModeTab CIDER_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Cider.MOD_ID, "cider_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.COMPOST_BLOCK))
                    .title(Component.translatable("creativemodetab.cider.cider_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.COMPOST_BLOCK);

                    }).build());

    public static void registerModCreativeModTabs() {
        Cider.LOGGER.info("Registering Creative Mode Tabs for" + Cider.MOD_ID);
    }
}
