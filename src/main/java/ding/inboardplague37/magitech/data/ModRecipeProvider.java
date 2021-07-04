package ding.inboardplague37.magitech.data;

import java.util.function.Consumer;

import ding.inboardplague37.magitech.MagiTechMod;
import ding.inboardplague37.magitech.setup.ModBlocks;
import ding.inboardplague37.magitech.setup.ModItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

public class ModRecipeProvider extends RecipeProvider{

	public ModRecipeProvider(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
		ShapelessRecipeBuilder.shapeless(ModItems.CRYSTALIZED_MANA.get(), 9)
			.requires(ModBlocks.CRYSTALIZED_MANA_BLOCK.get())
			.unlockedBy("has_item", has(ModItems.CRYSTALIZED_MANA.get()))
			.save(consumer, modId("crystalized_mana_block_uncraft"));
		
		ShapelessRecipeBuilder.shapeless(ModItems.CRYSTALIZED_MANA_FRAGMENT.get(), 9)
			.requires(ModItems.CRYSTALIZED_MANA.get())
			.unlockedBy("has_item", has(ModItems.CRYSTALIZED_MANA.get()))
			.save(consumer, modId("crystalized_mana_uncraft"));
		
		ShapedRecipeBuilder.shaped(ModBlocks.CRYSTALIZED_MANA_BLOCK.get())
			.define('#', ModItems.CRYSTALIZED_MANA.get())
			.pattern("###")
			.pattern("###")
			.pattern("###")
			.unlockedBy("has_item", has(ModItems.CRYSTALIZED_MANA.get()))
			.save(consumer, modId("crystalized_mana_block_craft"));
		
		ShapedRecipeBuilder.shaped(ModItems.CRYSTALIZED_MANA.get())
			.define('#', ModItems.CRYSTALIZED_MANA_FRAGMENT.get())
			.pattern("###")
			.pattern("###")
			.pattern("###")
			.unlockedBy("has_item", has(ModItems.CRYSTALIZED_MANA.get()))
			.save(consumer, modId("crystalized_mana_craft"));
		
		CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.CRYSTALIZED_MANA_ORE.get()), ModItems.CRYSTALIZED_MANA.get(), 0.7f, 200)
			.unlockedBy("has_item", has(ModBlocks.CRYSTALIZED_MANA_ORE.get()))
			.save(consumer, modId("crystalized_mana_ore_smelting"));
		
		CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.CRYSTALIZED_MANA_ORE.get()), ModItems.CRYSTALIZED_MANA.get(), 0.7f, 100)
			.unlockedBy("has_item", has(ModBlocks.CRYSTALIZED_MANA_ORE.get()))
			.save(consumer, modId("crystalized_mana_ore_blasting"));
	}
	
	private static ResourceLocation modId(String path) {
		return new ResourceLocation(MagiTechMod.MOD_ID, path);
	}
}
