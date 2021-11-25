package com.jaydo.gemcraft.world;
import com.jaydo.gemcraft.main.Main;
import com.jaydo.gemcraft.setup.Registration;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;

import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.BiasedToBottomHeight;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.rmi.registry.RegistryHandler;

@Mod.EventBusSubscriber
public class WorldGen {

    public static ConfiguredFeature<?, ?> OVR_ORE_SILVER_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_SILVER_GEN_D;
    public static ConfiguredFeature<?, ?> OVR_ORE_TIN_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_PLATINUM_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_IRIDIUM_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_SAPPHIRE_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_RUBY_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_AQUAMARINE_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_TURQUOISE_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_ONYX_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_OPAL_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_JADE_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_GARNET_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_BERYL_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_SUNSTONE_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_MAGMITE_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_CORUNDUM_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_MOONSTONE_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_PURPURITE_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_CHRYSOCOLLA_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_TORRID_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_TORRID_GEN_DESERT;
    public static ConfiguredFeature<?, ?> NETHER_ORE_TORRID_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_FRIGID_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_FRIGID_GEN_ICY;
    public static ConfiguredFeature<?, ?> OVR_ORE_CHAOS_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_CHAOS_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_XP_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_XP_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_XP_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_PRISMATIC_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_RADIANT_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_RADIANT_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_SATURATED_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_LUSH_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_LUSH_GEN_D;
    public static ConfiguredFeature<?, ?> OVR_ORE_LITHIC_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_TURBULENT_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_LUSH_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_ENTROPIC_GEN;
    public static ConfiguredFeature<?, ?> NETHER_ORE_CATALYZING_GEN;
    public static ConfiguredFeature<?, ?> OVR_ORE_CATALYZING_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_NULL_GEN;
    public static ConfiguredFeature<?, ?> END_ORE_CHAOS_GEN;
    public static int GemVeinSize = 4;
    public static int EssenceVeinSizeS = 5;
    public static int EssenceVeinSizeL = 10;
    public static int RarityCommon = 20;
    public static int RarityUncommon = 10;
    public static int RarityRare = 5;
    public static int RarityEpic=3;
    public static int RarityLegendary=2;

    public static void registerOres() {
        ///////////OVERWORLD START
        OVR_ORE_SILVER_GEN = register("ovr_ore_silver_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_SILVER_S.get().defaultBlockState(),
                        5, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))))
                .squared()
                .count(RarityCommon));
        OVR_ORE_SILVER_GEN_D = register("ovr_ore_silver_d_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_DEEPSLATE),
                        Registration.ORE_SILVER_D.get().defaultBlockState(),
                        15, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(20))))
                .squared()
                .count(RarityCommon));

        OVR_ORE_TIN_GEN = register("ovr_ore_tin_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_TIN.get().defaultBlockState(),
                        8, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityCommon));

        OVR_ORE_SAPPHIRE_GEN = register("ovr_ore_sapphire_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_SAPPHIRE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))))
                .squared()
                .count(RarityRare));
        OVR_ORE_RUBY_GEN = register("ovr_ore_ruby_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_RUBY.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(32))))
                .squared()
                .count(RarityRare));
        OVR_ORE_AQUAMARINE_GEN = register("ovr_ore_aquamarine_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_SAND),
                        Registration.ORE_AQUAMARINE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(50), VerticalAnchor.absolute(80))))
                .squared()
                .count(RarityRare));
        OVR_ORE_TURQUOISE_GEN = register("ovr_ore_turquoise_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_SAND_STONE),
                        Registration.ORE_TURQUOISE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(40), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityRare));
        OVR_ORE_ONYX_GEN = register("ovr_ore_onyx_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_ONYX.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(16))))
                .squared()
                .count(RarityRare));
        OVR_ORE_OPAL_GEN = register("ovr_ore_opal_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_OPAL.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(80), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityRare));
        OVR_ORE_JADE_GEN = register("ovr_ore_jade_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_GRAVEL),
                        Registration.ORE_JADE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityRare));
        OVR_ORE_CORUNDUM_GEN = register("ovr_ore_corundum_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_BEDROCK),
                        Registration.ORE_CORUNDUM.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.5F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(2), VerticalAnchor.absolute(5))))
                .squared()
                .count(RarityEpic));

        ///////////NETHER START
        NETHER_ORE_PLATINUM_GEN = register("nether_ore_platinum_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_PLATINUM.get().defaultBlockState(),
                        4, // Vein size
                        0.75F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityCommon));
        NETHER_ORE_GARNET_GEN = register("nether_ore_garnet_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_SAND),
                        Registration.ORE_GARNET.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.75F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(15));
        NETHER_ORE_BERYL_GEN = register("nether_ore_beryl_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_BASALT),
                        Registration.ORE_BERYL.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityRare));
        NETHER_ORE_SUNSTONE_GEN = register("nether_ore_sunstone_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_SUNSTONE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.75F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(100), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityRare));
        NETHER_ORE_MAGMITE_GEN = register("nether_ore_magmite_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_MAGMITE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.75F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(20))))
                .squared()
                .count(RarityRare));

        ///////////END START
        END_ORE_IRIDIUM_GEN = register("end_ore_iridium_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_IRIDIUM.get().defaultBlockState(),
                        3, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityUncommon));
        END_ORE_MOONSTONE_GEN = register("end_ore_moonstone_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_MOONSTONE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityEpic));
        END_ORE_PURPURITE_GEN = register("end_ore_purpurite_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_PURPURITE.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityEpic));
        END_ORE_CHRYSOCOLLA_GEN = register("end_ore_chrysocolla_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_CHRYSOCOLLA.get().defaultBlockState(),
                        GemVeinSize, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityEpic));

        ///////////ESSENCE START

        OVR_ORE_TORRID_GEN = register("ovr_ore_torrid_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_TORRID_S.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(16))))
                .squared()
                .count(RarityUncommon));

        OVR_ORE_TORRID_GEN_DESERT = register("ovr_ore_torrid_gen_desert", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_TORRID_S.get().defaultBlockState(),
                        EssenceVeinSizeL, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityUncommon));

        NETHER_ORE_TORRID_GEN = register("nether_ore_torrid_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_TORRID_N.get().defaultBlockState(),
                        EssenceVeinSizeL, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_FRIGID_GEN = register("ovr_ore_frigid_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_FRIGID.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(80), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_FRIGID_GEN_ICY = register("ovr_ore_frigid_gen_icy", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_FRIGID.get().defaultBlockState(),
                        EssenceVeinSizeL, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(20), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_CHAOS_GEN = register("ovr_ore_chaos_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_CHAOS_S.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // Exposition of the Ore
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(32))))
                .squared()
                .count(RarityRare));
        NETHER_ORE_CHAOS_GEN = register("nether_ore_chaos_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_CHAOS_N.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(80), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityRare));
        END_ORE_CHAOS_GEN = register("end_ore_chaos_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_CHAOS_E.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))))
                .squared()
                .count(RarityRare));
        OVR_ORE_XP_GEN = register("ovr_ore_xp_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_DEEPSLATE),
                        Registration.ORE_XP_0.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30))))
                .squared()
                .count(RarityUncommon));
        NETHER_ORE_XP_GEN = register("nether_ore_xp_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_SAND),
                        Registration.ORE_XP_1.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityRare));
        END_ORE_XP_GEN = register("end_ore_xp_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_XP_2.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityEpic));
        END_ORE_PRISMATIC_GEN = register("end_ore_prismatic_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_PRISMATIC.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityEpic));
        NETHER_ORE_RADIANT_GEN = register("nether_ore_radiant_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_RADIANT_N.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(100), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_RADIANT_GEN = register("ovr_ore_radiant_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_RADIANT_S.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(100), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_SATURATED_GEN = register("ovr_ore_saturated_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_SATURATED.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_LUSH_GEN = register("ovr_ore_lush_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_LUSH_S.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityRare));
        OVR_ORE_LUSH_GEN_D = register("ovr_ore_lush_gen_d", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_DIRT),
                        Registration.ORE_LUSH_D.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityEpic));
        NETHER_ORE_LUSH_GEN = register("nether_ore_lush_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_GRASS),
                        Registration.ORE_LUSH_N.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_LITHIC_GEN = register("ovr_ore_lithic_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_LITHIC.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityUncommon));
        OVR_ORE_TURBULENT_GEN = register("ovr_ore_turbulent_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_TURBULENT.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(80), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityCommon));
        NETHER_ORE_ENTROPIC_GEN = register("nether_ore_entropic_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_ENTROPIC.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityUncommon));
        NETHER_ORE_CATALYZING_GEN = register("nether_ore_catalyzing_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.NETHER_STONE),
                        Registration.ORE_CATALYZING_N.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityRare));
        OVR_ORE_CATALYZING_GEN = register("ovr_ore_catalyzing_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.OVR_STONE),
                        Registration.ORE_CATALYZING_S.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))))
                .squared()
                .count(RarityLegendary));
        END_ORE_NULL_GEN = register("end_ore_null_gen", Feature.ORE
                .configured(new OreConfiguration(new TagMatchTest(Main.END_STONE),
                        Registration.ORE_NULL.get().defaultBlockState(),
                        EssenceVeinSizeS, // Vein size
                        0.25F))  // How exposed the ore is
                .range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))))
                .squared()
                .count(RarityEpic));
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if (event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            if (NETHER_ORE_BERYL_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_BERYL_GEN);
            if (NETHER_ORE_PLATINUM_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_PLATINUM_GEN);
            if (NETHER_ORE_GARNET_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_GARNET_GEN);
            if (NETHER_ORE_SUNSTONE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_SUNSTONE_GEN);
            if (NETHER_ORE_MAGMITE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_MAGMITE_GEN);
            if (NETHER_ORE_TORRID_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_TORRID_GEN);
            if (NETHER_ORE_CHAOS_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_CHAOS_GEN);
            if (NETHER_ORE_ENTROPIC_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_ENTROPIC_GEN);
            if (NETHER_ORE_XP_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_XP_GEN);
            if (NETHER_ORE_CATALYZING_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ORE_CATALYZING_GEN);


        }
        if (event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
            if (END_ORE_IRIDIUM_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_IRIDIUM_GEN);
            if (END_ORE_MOONSTONE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_MOONSTONE_GEN);
            if (END_ORE_PURPURITE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_PURPURITE_GEN);
            if (END_ORE_CHRYSOCOLLA_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_CHRYSOCOLLA_GEN);
            if (END_ORE_XP_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_XP_GEN);
            if (END_ORE_PRISMATIC_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_PRISMATIC_GEN);
            if (END_ORE_NULL_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_NULL_GEN);
            if (END_ORE_CHAOS_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_ORE_CHAOS_GEN);
        }
        if (!event.getCategory().equals(Biome.BiomeCategory.THEEND) &&(!event.getCategory().equals(Biome.BiomeCategory.NETHER))) {
            if (OVR_ORE_SILVER_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_SILVER_GEN);
            if (OVR_ORE_SILVER_GEN_D != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_SILVER_GEN_D);
            if (OVR_ORE_TIN_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_TIN_GEN);
            if (OVR_ORE_SAPPHIRE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_SAPPHIRE_GEN);
            if (OVR_ORE_RUBY_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_RUBY_GEN);
            if (OVR_ORE_ONYX_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_ONYX_GEN);
            if (OVR_ORE_OPAL_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_OPAL_GEN);
            if (OVR_ORE_JADE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_JADE_GEN);
            if (OVR_ORE_CORUNDUM_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_CORUNDUM_GEN);
            if (OVR_ORE_TORRID_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_TORRID_GEN);
            if (OVR_ORE_FRIGID_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_FRIGID_GEN);
            if (OVR_ORE_CHAOS_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_CHAOS_GEN);
            if (OVR_ORE_XP_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_XP_GEN);
            if (OVR_ORE_TURBULENT_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_TURBULENT_GEN);
            if (OVR_ORE_RADIANT_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_RADIANT_GEN);
            if (OVR_ORE_CATALYZING_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_CATALYZING_GEN);
            if (OVR_ORE_CATALYZING_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_CATALYZING_GEN);
            if (OVR_ORE_LUSH_GEN_D != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_LUSH_GEN_D);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.BEACH)) {
            if (OVR_ORE_AQUAMARINE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_AQUAMARINE_GEN);
            if (OVR_ORE_SATURATED_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_SATURATED_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.ICY)||(event.getCategory().equals(Biome.BiomeCategory.TAIGA))) {
            if (OVR_ORE_FRIGID_GEN_ICY != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_FRIGID_GEN_ICY);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.RIVER)) {
            if (OVR_ORE_AQUAMARINE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_AQUAMARINE_GEN);
            if (OVR_ORE_SATURATED_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_SATURATED_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.OCEAN)) {
            if (OVR_ORE_AQUAMARINE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_AQUAMARINE_GEN);
            if (OVR_ORE_SATURATED_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_SATURATED_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.JUNGLE)) {
            if (OVR_ORE_LUSH_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_LUSH_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.FOREST)) {
            if (OVR_ORE_LUSH_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_LUSH_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.EXTREME_HILLS)) {
            if (OVR_ORE_LITHIC_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_LITHIC_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.PLAINS)) {
            if (OVR_ORE_LITHIC_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_LITHIC_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.SWAMP)) {
            if (OVR_ORE_AQUAMARINE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_AQUAMARINE_GEN);
            if (OVR_ORE_SATURATED_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_SATURATED_GEN);
            if (OVR_ORE_LUSH_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_LUSH_GEN);
        }
        if (event.getCategory().equals(Biome.BiomeCategory.DESERT)||(event.getCategory().equals(Biome.BiomeCategory.SAVANNA))) {
            if (OVR_ORE_TURQUOISE_GEN != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_TURQUOISE_GEN);
            if (OVR_ORE_TORRID_GEN_DESERT != null)
                generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVR_ORE_TORRID_GEN_DESERT);
        }
    }

    private static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configureFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Main.MODID + ":" + name), configureFeature);
    }

}

