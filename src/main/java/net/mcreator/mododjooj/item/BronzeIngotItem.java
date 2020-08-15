
package net.mcreator.mododjooj.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mododjooj.itemgroup.TigoguiItemGroup;
import net.mcreator.mododjooj.MododjoojModElements;

@MododjoojModElements.ModElement.Tag
public class BronzeIngotItem extends MododjoojModElements.ModElement {
	@ObjectHolder("mododjooj:bronze_ingot")
	public static final Item block = null;
	public BronzeIngotItem(MododjoojModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TigoguiItemGroup.tab).maxStackSize(64));
			setRegistryName("bronze_ingot");
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
