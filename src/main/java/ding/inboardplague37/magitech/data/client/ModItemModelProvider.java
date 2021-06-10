package ding.inboardplague37.magitech.data.client;

import ding.inboardplague37.magitech.MagiTechMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider{
	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, MagiTechMod.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		withExistingParent("crystalized_mana_ore", modLoc("block/crystalized_mana_ore"));
		withExistingParent("crystalized_mana_block", modLoc("block/crystalized_mana_block"));
		
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		
		builder(itemGenerated, "crystalized_mana");
		builder(itemGenerated, "crystalized_mana_fragment");
	}
	
	private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
		return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
	}
}
