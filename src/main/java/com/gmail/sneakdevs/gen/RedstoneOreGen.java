package com.gmail.sneakdevs.gen;

import com.gmail.sneakdevs.blocks.Ores;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class RedstoneOreGen {
    public static ConfiguredFeature<?, ?> REDSTONE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    Ores.NETHER_REDSTONE_ORE.getDefaultState(),
                    16)) //Vein Size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    10,
                    0,
                    72 //Max Y height
            )))
            .spreadHorizontally()
            .repeat(3); //Probably changes the rarity
}
