package ding.inboardplague37.magitech.setup;

import java.util.function.Supplier;

import ding.inboardplague37.magitech.MagiTechMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
	public static final RegistryObject<Block> CRYSTALIZED_MANA_ORE = register("crystalized_mana_ore", () ->
			new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2)
					.harvestLevel(2)
					.harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> CRYSTALIZED_MANA_BLOCK = register("crystalized_mana_block", () ->
			new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(2)
					.sound(SoundType.METAL)));
	
	static void register() {}
	
	private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
		return Registration.BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
		RegistryObject<T> ret = registerNoItem(name, block);
		Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(MagiTechMod.TAB_MAGITECH)));
		return ret;
	}
}
