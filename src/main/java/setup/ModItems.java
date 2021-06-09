package setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	public static final RegistryObject<Item> CRYSTALIZED_MANA = Registration.ITEMS.register("crystalized_mana", () ->
			new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
	
	static void register() {}
}
