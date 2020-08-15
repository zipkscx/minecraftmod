
package net.mcreator.mododjooj.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mododjooj.block.MarblebaseBlock;
import net.mcreator.mododjooj.MododjoojModElements;

@MododjoojModElements.ModElement.Tag
public class TigoguiItemGroup extends MododjoojModElements.ModElement {
	public TigoguiItemGroup(MododjoojModElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtigogui") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MarblebaseBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
