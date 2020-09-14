package com.gmail.sneakdevs.gen;

import com.gmail.sneakdevs.blocks.Ores;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class IronOreGen {
    public static ConfiguredFeature<?, ?> IRON_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    Ores.NETHER_IRON_ORE.getDefaultState(),
                    12)) //Vein Size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    100,
                    0,
                    126 //Max Y height
            )))
            .spreadHorizontally()
            .repeat(5); //Probably changes the rarity
}
