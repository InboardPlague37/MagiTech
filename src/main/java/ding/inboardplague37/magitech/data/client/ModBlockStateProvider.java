package ding.inboardplague37.magitech.data.client;

import ding.inboardplague37.magitech.MagiTechMod;
import ding.inboardplague37.magitech.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, MagiTechMod.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.CRYSTALIZED_MANA_ORE.get());
	}

}
