package fr.bixboy.csm.init;

import fr.bixboy.csm.CSM;
import fr.bixboy.csm.utils.CustomItemTiers;
import fr.bixboy.csm.utils.ModItemGroups;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CSM.MODID);

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick", () -> new Item(new Item.Properties().tab(ModItemGroups.CSM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(CustomItemTiers.COPPER, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties().tab(ModItemGroups.CSM_TAB)));
}
