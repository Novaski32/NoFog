package com.example.nofog;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NoFogMod.MODID, version = NoFogMod.VERSION, name = NoFogMod.NAME)
public class NoFogMod {

    public static final String MODID = "nofog";
    public static final String VERSION = "1.0";
    public static final String NAME = "NoFog";

    @Mod.Instance
    public static NoFogMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new FogHandler());
    }
}