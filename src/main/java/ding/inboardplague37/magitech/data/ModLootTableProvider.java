package ding.inboardplague37.magitech.data;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import ding.inboardplague37.magitech.setup.ModBlocks;
import ding.inboardplague37.magitech.setup.ModItems;
import ding.inboardplague37.magitech.setup.Registration;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;



public class ModLootTableProvider extends LootTableProvider{

	public ModLootTableProvider(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables(){
		return ImmutableList.of(
				Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK)
				);
	}
	
	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
		map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validate(validationtracker, p_218436_2_, p_218436_3_));
	}
	
	public static class ModBlockLootTables extends BlockLootTables {
		@Override
		protected void addTables() {
			dropSelf(ModBlocks.CRYSTALIZED_MANA_BLOCK.get());
			dropSelf(ModBlocks.CRYSTALIZED_MANA_ORE.get());
//			createSilkTouchDispatchTable(ModBlocks.CRYSTALIZED_MANA_ORE.get(), applyExplosionDecay(ModBlocks.CRYSTALIZED_MANA_ORE.get(), ItemLootEntry.lootTableItem(ModItems.CRYSTALIZED_MANA.get()).apply(SetCount.setCount(RandomValueRange.between(3.0F, 6.0F))).apply(ApplyBonus.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
		}
		
		@Override
		protected Iterable<Block> getKnownBlocks() {
			return Registration.BLOCKS.getEntries().stream()
					.map(RegistryObject::get)
					.collect(Collectors.toList());
		}
	}

}
