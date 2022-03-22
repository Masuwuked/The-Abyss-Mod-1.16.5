
package net.mcreator.theabyss.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.theabyss.block.AbyssframeBlock;
import net.mcreator.theabyss.TheAbyssModElements;

@TheAbyssModElements.ModElement.Tag
public class TheAbysselementsItemGroup extends TheAbyssModElements.ModElement {
	public TheAbysselementsItemGroup(TheAbyssModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabthe_abysselements") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AbyssframeBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
