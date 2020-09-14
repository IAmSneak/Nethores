package com.gmail.sneakdevs.gen;

import com.gmail.sneakdevs.blocks.Ores;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class EmeraldOreGen {
    public static ConfiguredFeature<?, ?> EMERALD_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    Ores.NETHER_EMERALD_ORE.getDefaultState(),
                    3)) //Vein Size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    120 //Max Y height
            )))
            .spreadHorizontally()
            .repeat(14); //Probably changes the rarity
}
