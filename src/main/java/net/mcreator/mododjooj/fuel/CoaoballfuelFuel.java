
package net.mcreator.mododjooj.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.mododjooj.item.CoalBallItem;
import net.mcreator.mododjooj.MododjoojModElements;

@MododjoojModElements.ModElement.Tag
public class CoaoballfuelFuel extends MododjoojModElements.ModElement {
	public CoaoballfuelFuel(MododjoojModElements instance) {
		super(instance, 67);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(CoalBallItem.block, (int) (1)).getItem())
			event.setBurnTime(6400);
	}
}
