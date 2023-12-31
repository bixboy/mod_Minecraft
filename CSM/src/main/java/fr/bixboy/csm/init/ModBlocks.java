package fr.bixboy.csm.init;

import fr.bixboy.csm.CSM;
import fr.bixboy.csm.blocks.BlockRedEmerald;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CSM.MODID);


    public static final RegistryObject<Block> BLUE_EMERALD_BLOCK = createBlock("blue_emerald_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_EMERALD_BLOCK = createBlock("red_emerald_block", BlockRedEmerald::new);

    public static final RegistryObject<Block> AMETHYST_ORE = createBlock("amethyst_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

}
