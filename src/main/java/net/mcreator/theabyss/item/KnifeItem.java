
package net.mcreator.theabyss.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.theabyss.itemgroup.TheAbysselementsItemGroup;
import net.mcreator.theabyss.TheAbyssModElements;

@TheAbyssModElements.ModElement.Tag
public class KnifeItem extends TheAbyssModElements.ModElement {
	@ObjectHolder("the_abyss:knife")
	public static final Item block = null;

	public KnifeItem(TheAbyssModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TheAbysselementsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("knife");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
