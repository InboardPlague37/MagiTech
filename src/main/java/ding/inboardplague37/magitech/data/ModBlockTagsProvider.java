package ding.inboardplague37.magitech.data;

import ding.inboardplague37.magitech.MagiTechMod;
import ding.inboardplague37.magitech.setup.ModBlocks;
import ding.inboardplague37.magitech.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider{
	public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, MagiTechMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		tag(ModTags.Blocks.ORE_CRYSTALIZED_MANA).add(ModBlocks.CRYSTALIZED_MANA_ORE.get());
		tag(ModTags.Blocks.STORAGE_CRYSTALIZED_MANA).add(ModBlocks.CRYSTALIZED_MANA_BLOCK.get());
	}
}
