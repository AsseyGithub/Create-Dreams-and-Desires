package uwu.lopyluna.create_dd.content.block.bronze_encased_fan;

import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import net.minecraft.world.level.Level;
import uwu.lopyluna.create_dd.init.DDRecipeTypes;

public class SuperHeatingRecipe extends ProcessingRecipe<BakingFanProcessing.SuperHeatingWrapper> {

	public SuperHeatingRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
		super(DDRecipeTypes.SUPERHEATING, params);
	}

	@Override
	public boolean matches(BakingFanProcessing.SuperHeatingWrapper inv, Level worldIn) {
		if (inv.isEmpty())
			return false;
		return ingredients.get(0)
				.test(inv.getItem(0));
	}

	@Override
	protected int getMaxInputCount() {
		return 1;
	}

	@Override
	protected int getMaxOutputCount() {
		return 12;
	}
}
