package com.example.nofog;

import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FogHandler {

    @SubscribeEvent
    public void onFogDensity(EntityViewRenderEvent.FogDensity event) {
        event.density = 0.0f;
        event.setCanceled(true);
    }
}