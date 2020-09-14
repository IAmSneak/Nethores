package com.gmail.sneakdevs;

import com.gmail.sneakdevs.gen.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

import static com.gmail.sneakdevs.blocks.Ores.*;

public class Nethores implements ModInitializer {

    @Override
    public void onInitialize() {

        //Register blocks
        Registry.register(Registry.BLOCK, new Identifier("nethores", "nether_diamond_ore"), NETHER_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier("nethores", "nether_iron_ore"), NETHER_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier("nethores", "nether_coal_ore"), NETHER_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier("nethores", "nether_lapis_ore"), NETHER_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier("nethores", "nether_emerald_ore"), NETHER_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier("nethores", "nether_redstone_ore"), NETHER_REDSTONE_ORE);

        //Register block items
        Registry.register(Registry.ITEM, new Identifier("nethores", "nether_diamond_ore"), new BlockItem(NETHER_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("nethores", "nether_coal_ore"), new BlockItem(NETHER_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("nethores", "nether_iron_ore"), new BlockItem(NETHER_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("nethores", "nether_lapis_ore"), new BlockItem(NETHER_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("nethores", "nether_redstone_ore"), new BlockItem(NETHER_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("nethores", "nether_emerald_ore"), new BlockItem(NETHER_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        //Register ore features
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("nethores", "diamond_nether"), DiamondOreGen.DIAMOND_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("nethores", "iron_nether"), IronOreGen.IRON_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("nethores", "coal_nether"), CoalOreGen.COAL_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("nethores", "redstone_nether"), RedstoneOreGen.REDSTONE_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("nethores", "lapis_nether"), LapisOreGen.LAPIS_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("nethores", "emerald_nether"), EmeraldOreGen.EMERALD_NETHER);
    }

}