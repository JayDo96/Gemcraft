package com.jaydo.gemcraft.main;


import com.jaydo.gemcraft.gui.GemcraftCreativeTabBauble;
import com.jaydo.gemcraft.gui.GemcraftCreativeTabMaterials;
import com.jaydo.gemcraft.world.WorldGen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.jaydo.gemcraft.gui.GemcraftCreativeTab;
import com.jaydo.gemcraft.setup.Registration;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main
{
	public static final String MODID = "gemcraft";
   // private static final Logger LOGGER = LogManager.getLogger();
    
    public Main() {
        Registration.init();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    public static final GemcraftCreativeTab GemcraftTab = new GemcraftCreativeTab("GemcraftTab");
    public static final GemcraftCreativeTabMaterials GemcraftTabMaterial = new GemcraftCreativeTabMaterials("GemcraftTabMaterial");
    public static final GemcraftCreativeTabBauble GemcraftTabBaubles = new GemcraftCreativeTabBauble("GemcraftTabBaubles");
	
    public static Tag<Block> OVR_STONE;
    public static Tag<Block> NETHER_STONE;
    public static Tag<Block> END_STONE;
    public static Tag<Block> OVR_SAND;
    public static Tag<Block> OVR_SAND_STONE;
    public static Tag<Block> OVR_GRAVEL;
    public static Tag<Block> NETHER_SAND;
    public static Tag<Block> NETHER_BASALT;
    public static Tag<Block> OVR_BEDROCK;
    public static Tag<Block> OVR_DEEPSLATE;
    public static Tag<Block> NETHER_GRASS;
    public static Tag<Block> OVR_DIRT;
    public static Tag<Block> OVR_TUFF;
    public static Tag<Block> NETHER_BLACKSTONE;
    private void setup(final FMLCommonSetupEvent event) {
        OVR_STONE = BlockTags.bind("gemcraft:overworld_stone");
        NETHER_STONE = BlockTags.bind("gemcraft:nether_stone");
        END_STONE = BlockTags.bind("gemcraft:end_stone");
        OVR_SAND = BlockTags.bind("gemcraft:overworld_sand");
        OVR_SAND_STONE = BlockTags.bind("gemcraft:overworld_sand_stone");
        OVR_GRAVEL= BlockTags.bind("gemcraft:overworld_gravel");
        NETHER_SAND= BlockTags.bind("gemcraft:nether_sand");
        NETHER_BASALT= BlockTags.bind("gemcraft:nether_basalt");
        OVR_BEDROCK= BlockTags.bind("gemcraft:overworld_bedrock");
        OVR_DEEPSLATE= BlockTags.bind("gemcraft:overworld_deepslate");
        NETHER_GRASS= BlockTags.bind("gemcraft:nether_grass");
        OVR_DIRT= BlockTags.bind("gemcraft:overworld_dirt");
        OVR_TUFF= BlockTags.bind("gemcraft:overworld_tuff");
        NETHER_BLACKSTONE= BlockTags.bind("gemcraft:nether_blackstone");
        WorldGen.registerOres();
    }



}
