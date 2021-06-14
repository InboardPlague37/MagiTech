package ding.inboardplague37.magitech.data;

import ding.inboardplague37.magitech.MagiTechMod;
import ding.inboardplague37.magitech.setup.ModBlocks;
import ding.inboardplague37.magitech.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider{
	public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, MagiTechMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		tag(ModTags.Blocks.ORES_CRYSTALIZED_MANA).add(ModBlocks.CRYSTALIZED_MANA_ORE.get());
		tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_CRYSTALIZED_MANA);
		tag(ModTags.Blocks.STORAGE_BLOCKS_CRYSTALIZED_MANA).add(ModBlocks.CRYSTALIZED_MANA_BLOCK.get());
		tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_CRYSTALIZED_MANA);
	}
}
