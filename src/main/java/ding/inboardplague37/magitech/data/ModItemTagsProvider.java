package ding.inboardplague37.magitech.data;

import ding.inboardplague37.magitech.MagiTechMod;
import ding.inboardplague37.magitech.setup.ModItems;
import ding.inboardplague37.magitech.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider{

	public ModItemTagsProvider(DataGenerator generatorIn, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(generatorIn, blockTagProvider, MagiTechMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		copy(ModTags.Blocks.ORE_CRYSTALIZED_MANA, ModTags.Items.ORE_CRYSTALIZED_MANA);
		copy(ModTags.Blocks.STORAGE_CRYSTALIZED_MANA, ModTags.Items.STORAGE_CRYSTALIZED_MANA);
		
		tag(ModTags.Items.CRYSTALIZED_MANA).add(ModItems.CRYSTALIZED_MANA.get());
		tag(ModTags.Items.FRAGMENT_CRYSTALIZED_MANA).add(ModItems.CRYSTALIZED_MANA_FRAGMENT.get());
	}

}
