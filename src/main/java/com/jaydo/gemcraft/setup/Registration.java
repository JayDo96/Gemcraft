package com.jaydo.gemcraft.setup;

import com.jaydo.gemcraft.blocks.*;
import com.jaydo.gemcraft.items.MaterialItem;
import com.jaydo.gemcraft.items.MundaneItem;
import com.jaydo.gemcraft.main.Main;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Registration {

	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);
	public static void init() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	ITEMS.register(bus);
	BLOCKS.register(bus);
	}
	//blocks
	public static final RegistryObject<OreBlock> ORE_SAPPHIRE = BLOCKS.register("ore_sapphire",OreBlock::new);
	public static final RegistryObject<OreBlock> ORE_RUBY = BLOCKS.register("ore_ruby",OreBlock::new);
	public static final RegistryObject<OreBlockSand> ORE_AQUAMARINE = BLOCKS.register("ore_aquamarine",OreBlockSand::new);
	public static final RegistryObject<OreBlock> ORE_TOPAZ = BLOCKS.register("ore_topaz",OreBlock::new);
	public static final RegistryObject<OreBlock> ORE_TURQUOISE = BLOCKS.register("ore_turquoise",OreBlock::new);
	public static final RegistryObject<OreBlockSand> ORE_JADE = BLOCKS.register("ore_jade",OreBlockSand::new);
	public static final RegistryObject<OreBlockMedium> ORE_ONYX = BLOCKS.register("ore_onyx",OreBlockMedium::new);
	public static final RegistryObject<OreBlockMedium> ORE_OPAL = BLOCKS.register("ore_opal",OreBlockMedium::new);
	public static final RegistryObject<OreBlockSand> ORE_GARNET = BLOCKS.register("ore_garnet",OreBlockSand::new);
	public static final RegistryObject<OreBlockMedium> ORE_CHRYSOCOLLA = BLOCKS.register("ore_chrysocolla",OreBlockMedium::new);
	public static final RegistryObject<OreBlockMedium> ORE_BERYL = BLOCKS.register("ore_beryl",OreBlockMedium::new);
	public static final RegistryObject<OreBlockHard> ORE_MOONSTONE = BLOCKS.register("ore_moonstone",OreBlockHard::new);
	public static final RegistryObject<OreBlockHard> ORE_PURPURITE = BLOCKS.register("ore_purpurite",OreBlockHard::new);
	public static final RegistryObject<OreBlockHard> ORE_SUNSTONE = BLOCKS.register("ore_sunstone",OreBlockHard::new);
	public static final RegistryObject<OreBlockHard> ORE_MAGMITE = BLOCKS.register("ore_magmite",OreBlockHard::new);
	public static final RegistryObject<OreBlockExtreme> ORE_CORUNDUM = BLOCKS.register("ore_corundum",OreBlockExtreme::new);
	public static final RegistryObject<OreBlock> ORE_XP_0 = BLOCKS.register("ore_xp_0",OreBlock::new);
	public static final RegistryObject<OreBlockSand> ORE_XP_1 = BLOCKS.register("ore_xp_1",OreBlockSand::new);
	public static final RegistryObject<OreBlockMedium> ORE_XP_2 = BLOCKS.register("ore_xp_2",OreBlockMedium::new);
	public static final RegistryObject<OreBlock> ORE_TURBULENT = BLOCKS.register("ore_turbulent",OreBlock::new);
	public static final RegistryObject<OreBlock> ORE_LITHIC = BLOCKS.register("ore_lithic",OreBlock::new);
	public static final RegistryObject<OreBlock> ORE_LUSH_S = BLOCKS.register("ore_lush_s",OreBlock::new);
	public static final RegistryObject<OreBlockMedium> ORE_LUSH_N = BLOCKS.register("ore_lush_n",OreBlockMedium::new);
	public static final RegistryObject<OreBlockDirt> ORE_LUSH_D = BLOCKS.register("ore_lush_d",OreBlockDirt::new);
	public static final RegistryObject<OreBlock> ORE_FRIGID = BLOCKS.register("ore_frigid",OreBlock::new);
	public static final RegistryObject<OreBlockMedium> ORE_RADIANT_N = BLOCKS.register("ore_radiant_n",OreBlockMedium::new);
	public static final RegistryObject<OreBlock> ORE_RADIANT_S = BLOCKS.register("ore_radiant_s",OreBlock::new);
	public static final RegistryObject<OreBlockHard> ORE_CATALYZING_S = BLOCKS.register("ore_catalyzing_s",OreBlockHard::new);
	public static final RegistryObject<OreBlockHard> ORE_CATALYZING_N = BLOCKS.register("ore_catalyzing_n",OreBlockHard::new);
	public static final RegistryObject<OreBlockHard> ORE_ENTROPIC = BLOCKS.register("ore_entropic",OreBlockHard::new);
	public static final RegistryObject<OreBlockMedium> ORE_TORRID_N = BLOCKS.register("ore_torrid_n",OreBlockMedium::new);
	public static final RegistryObject<OreBlock> ORE_TORRID_S = BLOCKS.register("ore_torrid_s",OreBlock::new);
	public static final RegistryObject<OreBlock> ORE_SATURATED = BLOCKS.register("ore_saturated",OreBlock::new);
	public static final RegistryObject<OreBlockHard> ORE_NULL = BLOCKS.register("ore_null",OreBlockHard::new);
	public static final RegistryObject<OreBlockMedium> ORE_CHAOS_N = BLOCKS.register("ore_chaos_n",OreBlockMedium::new);
	public static final RegistryObject<OreBlock> ORE_CHAOS_S = BLOCKS.register("ore_chaos_s",OreBlock::new);
	public static final RegistryObject<OreBlockHard> ORE_CHAOS_E = BLOCKS.register("ore_chaos_e",OreBlockHard::new);
	public static final RegistryObject<OreBlockHard> ORE_PRISMATIC = BLOCKS.register("ore_prismatic",OreBlockHard::new);
	public static final RegistryObject<OreBlock> ORE_TIN = BLOCKS.register("ore_tin",OreBlock::new);
	public static final RegistryObject<OreBlock> ORE_SILVER_S = BLOCKS.register("ore_silver_s",OreBlock::new);
	public static final RegistryObject<OreBlockMedium> ORE_SILVER_D = BLOCKS.register("ore_silver_d",OreBlockMedium::new);
	public static final RegistryObject<OreBlockMedium> ORE_PLATINUM = BLOCKS.register("ore_platinum",OreBlockMedium::new);
	public static final RegistryObject<OreBlockHard> ORE_IRIDIUM = BLOCKS.register("ore_iridium",OreBlockHard::new);
		//block items
	public static final RegistryObject<BlockItem> ORE_ITEM_SAPPHIRE = ITEMS.register("ore_sapphire",() -> new BlockItem(ORE_SAPPHIRE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_TURBULENT = ITEMS.register("ore_turbulent",() -> new BlockItem(ORE_TURBULENT.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_RUBY = ITEMS.register("ore_ruby",() -> new BlockItem(ORE_RUBY.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_AQUAMARINE = ITEMS.register("ore_aquamarine",() -> new BlockItem(ORE_AQUAMARINE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_TOPAZ = ITEMS.register("ore_topaz",() -> new BlockItem(ORE_TOPAZ.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_TURQUOISE = ITEMS.register("ore_turquoise",() -> new BlockItem(ORE_TURQUOISE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_JADE = ITEMS.register("ore_jade",() -> new BlockItem(ORE_JADE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_ONYX = ITEMS.register("ore_onyx",() -> new BlockItem(ORE_ONYX.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_OPAL = ITEMS.register("ore_opal",() -> new BlockItem(ORE_OPAL.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_GARNET = ITEMS.register("ore_garnet",() -> new BlockItem(ORE_GARNET.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_CHRYSOCOLLA = ITEMS.register("ore_chrysocolla",() -> new BlockItem(ORE_CHRYSOCOLLA.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_BERYL = ITEMS.register("ore_beryl",() -> new BlockItem(ORE_BERYL.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_MOONSTONE = ITEMS.register("ore_moonstone",() -> new BlockItem(ORE_MOONSTONE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_PURPURITE = ITEMS.register("ore_purpurite",() -> new BlockItem(ORE_PURPURITE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_SUNSTONE = ITEMS.register("ore_sunstone",() -> new BlockItem(ORE_SUNSTONE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_MAGMITE= ITEMS.register("ore_magmite",() -> new BlockItem(ORE_MAGMITE.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_CORUNDUM = ITEMS.register("ore_corundum",() -> new BlockItem(ORE_CORUNDUM.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_XP_0 = ITEMS.register("ore_xp_0",() -> new BlockItem(ORE_XP_0.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_XP_1 = ITEMS.register("ore_xp_1",() -> new BlockItem(ORE_XP_1.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_XP_2 = ITEMS.register("ore_xp_2",() -> new BlockItem(ORE_XP_2.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_LITHIC = ITEMS.register("ore_lithic",() -> new BlockItem(ORE_LITHIC.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_LUSH_S = ITEMS.register("ore_lush_s",() -> new BlockItem(ORE_LUSH_S.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_LUSH_N = ITEMS.register("ore_lush_n",() -> new BlockItem(ORE_LUSH_N.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_LUSH_D = ITEMS.register("ore_lush_d",() -> new BlockItem(ORE_LUSH_D.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_FRIGID = ITEMS.register("ore_frigid",() -> new BlockItem(ORE_FRIGID.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_RADIANT_N = ITEMS.register("ore_radiant_n",() -> new BlockItem(ORE_RADIANT_N.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_RADIANT_S = ITEMS.register("ore_radiant_s",() -> new BlockItem(ORE_RADIANT_S.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_CATALYZING_S = ITEMS.register("ore_catalyzing_s",() -> new BlockItem(ORE_CATALYZING_S.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_CATALYZING_N = ITEMS.register("ore_catalyzing_n",() -> new BlockItem(ORE_CATALYZING_N.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_ENTROPIC = ITEMS.register("ore_entropic",() -> new BlockItem(ORE_ENTROPIC.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_TORRID_N = ITEMS.register("ore_torrid_n",() -> new BlockItem(ORE_TORRID_N.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_TORRID_S = ITEMS.register("ore_torrid_s",() -> new BlockItem(ORE_TORRID_S.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_SATURATED = ITEMS.register("ore_saturated",() -> new BlockItem(ORE_SATURATED.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_NULL = ITEMS.register("ore_null",() -> new BlockItem(ORE_NULL.get(),new Item.Properties().tab(Main.GemcraftTab)));;
	public static final RegistryObject<BlockItem> ORE_ITEM_CHAOS_N = ITEMS.register("ore_chaos_n",() -> new BlockItem(ORE_CHAOS_N.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_CHAOS_S = ITEMS.register("ore_chaos_s",() -> new BlockItem(ORE_CHAOS_S.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_CHAOS_E = ITEMS.register("ore_chaos_e",() -> new BlockItem(ORE_CHAOS_E.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_PRISMATIC = ITEMS.register("ore_prismatic",() -> new BlockItem(ORE_PRISMATIC.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_TIN = ITEMS.register("ore_tin",() -> new BlockItem(ORE_TIN.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_SILVER_S = ITEMS.register("ore_silver_s",() -> new BlockItem(ORE_SILVER_S.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_SILVER_D = ITEMS.register("ore_silver_d",() -> new BlockItem(ORE_SILVER_D.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_PLATINUM = ITEMS.register("ore_platinum",() -> new BlockItem(ORE_PLATINUM.get(),new Item.Properties().tab(Main.GemcraftTab)));
	public static final RegistryObject<BlockItem> ORE_ITEM_IRIDIUM = ITEMS.register("ore_iridium",() -> new BlockItem(ORE_IRIDIUM.get(),new Item.Properties().tab(Main.GemcraftTab)));
	//essence
	public static final RegistryObject<Item> ESSENCE_XP = ITEMS.register("essence_xp",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_TORRID = ITEMS.register("essence_torrid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_TORRID = ITEMS.register("sliver_torrid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_TORRID = ITEMS.register("shard_torrid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_TORRID = ITEMS.register("core_torrid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_FRIGID= ITEMS.register("essence_frigid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_FRIGID= ITEMS.register("sliver_frigid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_FRIGID= ITEMS.register("shard_frigid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_FRIGID= ITEMS.register("core_frigid",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_PRISMATIC = ITEMS.register("essence_prismatic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_PRISMATIC = ITEMS.register("sliver_prismatic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_PRISMATIC = ITEMS.register("shard_prismatic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_PRISMATIC = ITEMS.register("core_prismatic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_RADIANT = ITEMS.register("essence_radiant",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_RADIANT = ITEMS.register("sliver_radiant",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_RADIANT = ITEMS.register("shard_radiant",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_RADIANT = ITEMS.register("core_radiant",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_SATURATED = ITEMS.register("essence_saturated",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_SATURATED = ITEMS.register("sliver_saturated",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_SATURATED = ITEMS.register("shard_saturated",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_SATURATED = ITEMS.register("core_saturated",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_LUSH = ITEMS.register("essence_lush",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_LUSH = ITEMS.register("sliver_lush",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_LUSH = ITEMS.register("shard_lush",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_LUSH = ITEMS.register("core_lush",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_LITHIC = ITEMS.register("essence_lithic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_LITHIC = ITEMS.register("sliver_lithic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_LITHIC = ITEMS.register("shard_lithic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_LITHIC = ITEMS.register("core_lithic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_TURBULENT = ITEMS.register("essence_turbulent",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_TURBULENT = ITEMS.register("sliver_turbulent",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_TURBULENT = ITEMS.register("shard_turbulent",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_TURBULENT = ITEMS.register("core_turbulent",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_ENTROPIC = ITEMS.register("essence_entropic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_ENTROPIC = ITEMS.register("sliver_entropic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_ENTROPIC = ITEMS.register("shard_entropic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_ENTROPIC = ITEMS.register("core_entropic",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_CATALYZING = ITEMS.register("essence_catalyzing",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_CATALYZING = ITEMS.register("sliver_catalyzing",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_CATALYZING = ITEMS.register("shard_catalyzing",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_CATALYZING = ITEMS.register("core_catalyzing",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> ESSENCE_NULL = ITEMS.register("essence_null",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SLIVER_NULL = ITEMS.register("sliver_null",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> SHARD_NULL = ITEMS.register("shard_null",() -> new MundaneItem(new Item.Properties()));
	public static final RegistryObject<Item> CORE_NULL = ITEMS.register("core_null",() -> new MundaneItem(new Item.Properties()));
	//Gems
	public static final RegistryObject<Item> GEM_LAPIS = ITEMS.register("gem_lapis",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_JET = ITEMS.register("gem_jet",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_BONE = ITEMS.register("gem_bone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_AMBER = ITEMS.register("gem_amber",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_JASPER = ITEMS.register("gem_jasper",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_SYLVANITE = ITEMS.register("gem_sylvanite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_PROUSTITE = ITEMS.register("gem_proustite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_MALACHITE = ITEMS.register("gem_malachite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_MAGNETITE = ITEMS.register("gem_magnetite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_CASSITERITE = ITEMS.register("gem_cassiterite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));

	public static final RegistryObject<Item> GEM_SAPPHIRE = ITEMS.register("gem_sapphire",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_FOSSIL = ITEMS.register("gem_fossil",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_AMETHYST = ITEMS.register("gem_amethyst",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GEM_RUBY = ITEMS.register("gem_ruby",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_AQUAMARINE = ITEMS.register("gem_aquamarine",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_TOPAZ = ITEMS.register("gem_topaz",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_TURQUOISE = ITEMS.register("gem_turquoise",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_JADE = ITEMS.register("gem_jade",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_CINNABAR = ITEMS.register("gem_cinnabar",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_SPERRYLITE = ITEMS.register("gem_sperrylite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GEM_ENDER = ITEMS.register("gem_ender",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));

	public static final RegistryObject<Item> GEM_ONYX = ITEMS.register("gem_onyx",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_GLOWSTONE = ITEMS.register("gem_glowstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_OPAL = ITEMS.register("gem_opal",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_GARNET = ITEMS.register("gem_garnet",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_CHRYSOCOLLA = ITEMS.register("gem_chrysocolla",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_BERYL = ITEMS.register("gem_beryl",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_DIAMOND = ITEMS.register("gem_diamond",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_FOOLS_GOLD = ITEMS.register("gem_fools_gold",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_SMOKY_QUARTZ = ITEMS.register("gem_smoky_quartz",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_BOWIEITE = ITEMS.register("gem_bowieite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_EMERALD = ITEMS.register("gem_emerald",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_OBSIDIAN = ITEMS.register("gem_obsidian",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_CHROMITE = ITEMS.register("gem_chromite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GEM_WITHER = ITEMS.register("gem_wither",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> GEM_MOONSTONE = ITEMS.register("gem_moonstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GEM_SUNSTONE = ITEMS.register("gem_sunstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GEM_PURPURITE = ITEMS.register("gem_purpurite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GEM_MAGMITE = ITEMS.register("gem_magmite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GEM_CORUNDUM = ITEMS.register("gem_corundum",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GEM_NETHERSTAR= ITEMS.register("gem_netherstar",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GEM_DRAGONSTONE= ITEMS.register("gem_dragonstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	//rough gems
	public static final RegistryObject<Item> ROUGH_LAPIS = ITEMS.register("rough_lapis",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_JET = ITEMS.register("rough_jet",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_AMBER = ITEMS.register("rough_amber",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_JASPER = ITEMS.register("rough_jasper",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_SYLVANITE = ITEMS.register("rough_sylvanite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_PROUSTITE = ITEMS.register("rough_proustite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_MALACHITE = ITEMS.register("rough_malachite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_MAGNETITE = ITEMS.register("rough_magnetite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> ROUGH_CASSITERITE = ITEMS.register("rough_cassiterite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.COMMON)));

	public static final RegistryObject<Item> ROUGH_SAPPHIRE = ITEMS.register("rough_sapphire",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_FOSSIL = ITEMS.register("rough_fossil",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_RUBY = ITEMS.register("rough_ruby",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_AQUAMARINE = ITEMS.register("rough_aquamarine",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_TOPAZ = ITEMS.register("rough_topaz",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_TURQUOISE = ITEMS.register("rough_turquoise",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_JADE = ITEMS.register("rough_jade",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_CINNABAR = ITEMS.register("rough_cinnabar",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_SPERRYLITE = ITEMS.register("rough_sperrylite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> ROUGH_ENDER = ITEMS.register("rough_ender",() -> new MundaneItem(new Item.Properties().rarity(Rarity.UNCOMMON)));

	public static final RegistryObject<Item> ROUGH_ONYX = ITEMS.register("rough_onyx",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_GLOWSTONE = ITEMS.register("rough_glowstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_OPAL = ITEMS.register("rough_opal",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_GARNET = ITEMS.register("rough_garnet",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_CHRYSOCOLLA = ITEMS.register("rough_chrysocolla",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_BERYL = ITEMS.register("rough_beryl",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_FOOLS_GOLD = ITEMS.register("rough_fools_gold",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_SMOKY_QUARTZ = ITEMS.register("rough_smoky_quartz",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_BOWIEITE = ITEMS.register("rough_bowieite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_CHROMITE = ITEMS.register("rough_chromite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROUGH_WITHER = ITEMS.register("rough_wither",() -> new MundaneItem(new Item.Properties().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> ROUGH_MOONSTONE = ITEMS.register("rough_moonstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> ROUGH_SUNSTONE = ITEMS.register("rough_sunstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> ROUGH_PURPURITE = ITEMS.register("rough_purpurite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> ROUGH_MAGMITE = ITEMS.register("rough_magmite",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> ROUGH_CORUNDUM = ITEMS.register("rough_corundum",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> ROUGH_DRAGONSTONE= ITEMS.register("rough_dragonstone",() -> new MundaneItem(new Item.Properties().rarity(Rarity.EPIC)));

	//Materials
	public static final RegistryObject<Item> DUST_GEM = ITEMS.register("dust_gem",() -> new MaterialItem(new Item.Properties()));
	
	public static final RegistryObject<Item> INGOT_BRONZE = ITEMS.register("ingot_bronze",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> DUST_BRONZE = ITEMS.register("dust_bronze",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> NUGGET_BRONZE = ITEMS.register("nugget_bronze",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<StorageBlock> STORAGE_BRONZE = BLOCKS.register("storage_bronze",StorageBlock::new);
	public static final RegistryObject<BlockItem> ITEM_STORAGE_BRONZE = ITEMS.register("storage_bronze",() -> new BlockItem(STORAGE_BRONZE.get(),new Item.Properties().tab(Main.GemcraftTabMaterial)));

	public static final RegistryObject<Item> NUGGET_COPPER = ITEMS.register("nugget_copper",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> DUST_COPPER = ITEMS.register("dust_copper",() -> new MaterialItem(new Item.Properties()));

	public static final RegistryObject<Item> INGOT_SILVER = ITEMS.register("ingot_silver",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> DUST_SILVER = ITEMS.register("dust_silver",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> NUGGET_SILVER = ITEMS.register("nugget_silver",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<StorageBlock> STORAGE_SILVER = BLOCKS.register("storage_silver",StorageBlock::new);
	public static final RegistryObject<BlockItem> ITEM_STORAGE_SILVER= ITEMS.register("storage_silver",() -> new BlockItem(STORAGE_SILVER.get(),new Item.Properties().tab(Main.GemcraftTabMaterial)));

	public static final RegistryObject<Item> INGOT_TIN = ITEMS.register("ingot_tin",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> DUST_TIN = ITEMS.register("dust_tin",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> NUGGET_TIN = ITEMS.register("nugget_tin",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<StorageBlock> STORAGE_TIN = BLOCKS.register("storage_tin",StorageBlock::new);
	public static final RegistryObject<BlockItem> ITEM_STORAGE_TIN= ITEMS.register("storage_tin",() -> new BlockItem(STORAGE_TIN.get(),new Item.Properties().tab(Main.GemcraftTabMaterial)));

	public static final RegistryObject<Item> INGOT_ELEMENTUM = ITEMS.register("ingot_elementum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> DUST_ELEMENTUM = ITEMS.register("dust_elementum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> NUGGET_ELEMENTUM = ITEMS.register("nugget_elementum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<StorageBlock> STORAGE_ELEMENTUM = BLOCKS.register("storage_elementum",StorageBlock::new);
	public static final RegistryObject<BlockItem> ITEM_STORAGE_ELEMENTUM= ITEMS.register("storage_elementum",() -> new BlockItem(STORAGE_ELEMENTUM.get(),new Item.Properties().tab(Main.GemcraftTabMaterial)));

	public static final RegistryObject<Item> INGOT_PLATINUM = ITEMS.register("ingot_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> DUST_PLATINUM = ITEMS.register("dust_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> NUGGET_PLATINUM = ITEMS.register("nugget_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<StorageBlock> STORAGE_PLATINUM = BLOCKS.register("storage_platinum",StorageBlock::new);
	public static final RegistryObject<BlockItem> ITEM_STORAGE_PLATINUM= ITEMS.register("storage_platinum",() -> new BlockItem(STORAGE_PLATINUM.get(),new Item.Properties().tab(Main.GemcraftTabMaterial)));

	public static final RegistryObject<Item> INGOT_IRIDIUM = ITEMS.register("ingot_iridium",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> DUST_IRIDIUM = ITEMS.register("dust_iridium",() -> new MaterialItem(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> NUGGET_IRIDIUM = ITEMS.register("nugget_iridium",() -> new MaterialItem(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
	public static final RegistryObject<StorageBlock> STORAGE_IRIDIUM = BLOCKS.register("storage_iridium",StorageBlock::new);
	public static final RegistryObject<BlockItem> ITEM_STORAGE_IRIDIUM= ITEMS.register("storage_iridium",() -> new BlockItem(STORAGE_IRIDIUM.get(),new Item.Properties().tab(Main.GemcraftTabMaterial)));


	//T1 items
	public static final RegistryObject<Item> RING_BRONZE = ITEMS.register("ring_bronze",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> RING_ELEMENTUM = ITEMS.register("ring_elementum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> RING_PLATINUM = ITEMS.register("ring_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> RING_IRIDIUM = ITEMS.register("ring_iridium",() -> new MaterialItem(new Item.Properties()));

	public static final RegistryObject<Item> AMULET_BRONZE = ITEMS.register("amulet_bronze",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> AMULET_ELEMENTUM = ITEMS.register("amulet_elementum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> AMULET_PLATINUM = ITEMS.register("amulet_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> AMULET_IRIDIUM = ITEMS.register("amulet_iridium",() -> new MaterialItem(new Item.Properties()));

	public static final RegistryObject<Item> BELT_BRONZE = ITEMS.register("belt_bronze",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> BELT_ELEMENTUM = ITEMS.register("belt_elementum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> BELT_PLATINUM = ITEMS.register("belt_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> BELT_IRIDIUM = ITEMS.register("belt_iridium",() -> new MaterialItem(new Item.Properties()));

	public static final RegistryObject<Item> VEST_BRONZE = ITEMS.register("vest_bronze",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> VEST_ELEMENTUM = ITEMS.register("vest_elementum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> VEST_PLATINUM = ITEMS.register("vest_platinum",() -> new MaterialItem(new Item.Properties()));
	public static final RegistryObject<Item> VEST_IRIDIUM = ITEMS.register("vest_iridium",() -> new MaterialItem(new Item.Properties()));
	//T2 items

}
