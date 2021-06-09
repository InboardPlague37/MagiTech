package ding.inboardplague37.magitech.data;

import ding.inboardplague37.magitech.MagiTechMod;
import ding.inboardplague37.magitech.data.client.ModBlockStateProvider;
import ding.inboardplague37.magitech.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MagiTechMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	private DataGenerators() {}
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
		gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
	}
}
