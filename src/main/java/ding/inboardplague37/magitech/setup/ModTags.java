package ding.inboardplague37.magitech.setup;

//import ding.inboardplague37.magitech.MagiTechMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
	public static final class Blocks {
		public static final ITag.INamedTag<Block> ORES_CRYSTALIZED_MANA = forge("ores/crystalized_mana");
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_CRYSTALIZED_MANA = forge("storage_blocks/crystalized_mana");
				
		private static ITag.INamedTag<Block> forge(String path){
			return BlockTags.bind(new ResourceLocation("forge", path).toString());
		}
		
//		private static ITag.INamedTag<Block> mod(String path){
//			return BlockTags.bind(new ResourceLocation(MagiTechMod.MOD_ID, path).toString());
//		}
	}
	
	public static final class Items {
		public static final ITag.INamedTag<Item> ORES_CRYSTALIZED_MANA = forge("ores/crystalized_mana");
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_CRYSTALIZED_MANA = forge("storage_blocks/crystalized_mana");
		
		public static final ITag.INamedTag<Item> INGOTS_CRYSTALIZED_MANA = forge("ingots/crystalized_mana");
		public static final ITag.INamedTag<Item> INGOTS_FRAGMENT_CRYSTALIZED_MANA = forge("ingots/crystalized_mana_nugget");
		
		private static ITag.INamedTag<Item> forge(String path){
			return ItemTags.bind(new ResourceLocation("forge", path).toString());
		}
		
//		private static ITag.INamedTag<Item> mod(String path){
//			return ItemTags.bind(new ResourceLocation(MagiTechMod.MOD_ID, path).toString());
//		}
	}
}
