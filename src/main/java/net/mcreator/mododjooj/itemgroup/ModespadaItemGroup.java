
package net.mcreator.mododjooj.itemgroup;

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
