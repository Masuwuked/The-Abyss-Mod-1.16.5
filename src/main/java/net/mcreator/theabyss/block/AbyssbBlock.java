
package net.mcreator.theabyss.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.theabyss.itemgroup.TheAbysselementsItemGroup;
import net.mcreator.theabyss.TheAbyssModElements;

import java.util.List;
import java.util.Collections;

@TheAbyssModElements.ModElement.Tag
public class AbyssbBlock extends TheAbyssModElements.ModElement {
	@ObjectHolder("the_abyss:abyssb")
	public static final Block block = null;

	public AbyssbBlock(TheAbyssModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TheAbysselementsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.PORTAL).sound(SoundType.GLASS).hardnessAndResistance(-1, 3600000).setLightLevel(s -> 15));
			setRegistryName("abyssb");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Blocks.BLUE_ORCHID));
		}
	}
}
