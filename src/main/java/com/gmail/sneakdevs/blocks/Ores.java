package com.gmail.sneakdevs.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Ores {
    public static final Block NETHER_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.4f ,1.4f).requiresTool().breakByTool(FabricToolTags.PICKAXES,4));
    public static final Block NETHER_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f ,1.6f).requiresTool().breakByTool(FabricToolTags.PICKAXES,2));
    public static final Block NETHER_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.2f ,1.2f).requiresTool().breakByTool(FabricToolTags.PICKAXES,1));
    public static final Block NETHER_REDSTONE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f ,1.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES,1));
    public static final Block NETHER_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f ,0.8f).breakByTool(FabricToolTags.PICKAXES,0));
    public static final Block NETHER_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.3f ,1.3f).requiresTool().breakByTool(FabricToolTags.PICKAXES,2));

}
