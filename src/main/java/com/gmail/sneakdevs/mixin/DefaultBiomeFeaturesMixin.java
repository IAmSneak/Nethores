package com.gmail.sneakdevs.mixin;

import com.gmail.sneakdevs.gen.*;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {
    @Inject(method = "addNetherMineables(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addNetherMineables(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, EmeraldOreGen.EMERALD_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, DiamondOreGen.DIAMOND_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, IronOreGen.IRON_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, CoalOreGen.COAL_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, LapisOreGen.LAPIS_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, RedstoneOreGen.REDSTONE_NETHER);

    }
}