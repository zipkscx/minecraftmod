
package net.mcreator.mododjooj.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mododjooj.item.EspadaItem;
import net.mcreator.mododjooj.MododjoojModElements;

@MododjoojModElements.ModElement.Tag
public class ModespadaItemGroup extends MododjoojModElements.ModElement {
	public ModespadaItemGroup(MododjoojModElements instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmodespada") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EspadaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
