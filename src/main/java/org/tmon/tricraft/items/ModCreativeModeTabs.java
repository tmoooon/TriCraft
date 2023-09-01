package org.tmon.tricraft.items;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.tmon.tricraft.TriCraft;

@Mod.EventBusSubscriber(modid = TriCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TRICRAFT_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        TRICRAFT_TAB = event.registerCreativeModeTab(new ResourceLocation(TriCraft.MOD_ID, "tricraft"),
                builder -> builder.icon(() -> new ItemStack(ModItems.INES_SWORD.get()))
                        .title(Component.translatable("creativemodetab.tricraft_tab")));
    }
}
