package ding.inboardplague37.magitech.data;

import ding.inboardplague37.magitech.MagiTechMod;
import ding.inboardplague37.magitech.setup.ModItems;
import ding.inboardplague37.magitech.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider{

	public ModItemTagsProvider(DataGenerator generatorIn, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(generatorIn, blockTagProvider, MagiTechMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		copy(ModTags.Blocks.ORES_CRYSTALIZED_MANA, ModTags.Items.ORES_CRYSTALIZED_MANA);
		copy(Tags.Blocks.ORES, Tags.Items.ORES);
		copy(ModTags.Blocks.STORAGE_BLOCKS_CRYSTALIZED_MANA, ModTags.Items.STORAGE_BLOCKS_CRYSTALIZED_MANA);
		copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
		
		tag(ModTags.Items.INGOTS_CRYSTALIZED_MANA).add(ModItems.CRYSTALIZED_MANA.get());
		tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_CRYSTALIZED_MANA);
		tag(ModTags.Items.INGOTS_FRAGMENT_CRYSTALIZED_MANA).add(ModItems.CRYSTALIZED_MANA_FRAGMENT.get());
		tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_FRAGMENT_CRYSTALIZED_MANA);
	}

}
