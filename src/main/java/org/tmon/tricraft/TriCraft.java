package org.tmon.tricraft;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.tmon.tricraft.blocks.ModBlocks;
import org.tmon.tricraft.items.ModCreativeModeTabs;
import org.tmon.tricraft.items.ModItems;

@Mod(TriCraft.MOD_ID)
public class TriCraft
{
    public static final String MOD_ID = "tricraft";
    private static final Logger LOGGER = LogUtils.getLogger();
    public TriCraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTabs.TRICRAFT_TAB){
            event.accept(ModItems.GIGERIUM_SWORD);
            event.accept(ModItems.GIGERIUM_PICKAXE);
            event.accept(ModItems.GIGERIUM_AXE);
            event.accept(ModItems.GIGERIUM_SHOVEL);
            event.accept(ModItems.GIGERIUM_HOE);
            event.accept(ModItems.GIGERIUM_HELMET);
            event.accept(ModItems.GIGERIUM_CHESTPLATE);
            event.accept(ModItems.GIGERIUM_LEGGINGS);
            event.accept(ModItems.GIGERIUM_BOOTS);
            event.accept(ModItems.INES_SWORD);
            event.accept(ModItems.INES_PICKAXE);
            event.accept(ModItems.INES_AXE);
            event.accept(ModItems.INES_SHOVEL);
            event.accept(ModItems.INES_HOE);
            event.accept(ModItems.INES_HELMET);
            event.accept(ModItems.INES_CHESTPLATE);
            event.accept(ModItems.INES_LEGGINGS);
            event.accept(ModItems.INES_BOOTS);
            event.accept(ModBlocks.GIGERIUM_BLOCK);
            event.accept(ModItems.GIGERIUM_INGOT);
            event.accept(ModItems.RAW_GIGERIUM);
            event.accept(ModItems.GIGERIUM_NUGGET);
            event.accept(ModBlocks.INES_BLOCK);
            event.accept(ModItems.INES_INGOT);
            event.accept(ModItems.RAW_INES);
            event.accept(ModItems.INES_NUGGET);
            event.accept(ModBlocks.GIGERIUM_ORE);
            event.accept(ModBlocks.DEEPSLATE_GIGERIUM_ORE);
            event.accept(ModBlocks.NETHER_INES_ORE);
            event.accept(ModBlocks.END_INES_ORE);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
