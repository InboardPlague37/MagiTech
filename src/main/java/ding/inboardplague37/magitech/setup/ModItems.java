package ding.inboardplague37.magitech.setup;

import ding.inboardplague37.magitech.MagiTechMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	public static final RegistryObject<Item> CRYSTALIZED_MANA = Registration.ITEMS.register("crystalized_mana", () ->
			new Item(new Item.Properties().tab(MagiTechMod.TAB_MAGITECH)));
	
	public static final RegistryObject<Item> CRYSTALIZED_MANA_FRAGMENT = Registration.ITEMS.register("crystalized_mana_fragment", () ->
			new Item(new Item.Properties().tab(MagiTechMod.TAB_MAGITECH)));
	
	static void register() {}
}
