package fr.bixboy.csm;

import com.sun.jna.WString;
import fr.bixboy.csm.init.ModBlocks;
import fr.bixboy.csm.init.ModTileEntities;
import fr.bixboy.csm.init.Moditems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CSM.MODID)
public class CSM {

    public static final String MODID = "csm";

    public CSM()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Moditems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModTileEntities.TILE_ENTITIES.register(bus);
    }

    private void setup(FMLCommonSetupEvent e)
    {

    }

    private void clientSetup(FMLClientSetupEvent e)
    {

    }
}
