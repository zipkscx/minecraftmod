
package net.mcreator.mododjooj.item;

@MododjoojModElements.ModElement.Tag
public class EspadaItem extends MododjoojModElements.ModElement {

	@ObjectHolder("mododjooj:espada")
	public static final Item block = null;

	public EspadaItem(MododjoojModElements instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(TigoguiItemGroup.tab)) {

		}.setRegistryName("espada"));
	}

}
