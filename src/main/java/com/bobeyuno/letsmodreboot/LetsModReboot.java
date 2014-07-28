package com.bobeyuno.letsmodreboot;

import com.bobeyuno.letsmodreboot.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "LetsModReboot", name = "LetsModReboot", version = "1.7.2-1.0")
public class LetsModReboot
{
    //Create an instance of the mod
    @Mod.Instance("LetsModReboot")
    public static  LetsModReboot instance;

    //load proxy stuff
    @SidedProxy(clientSide = "com.bobeyuno.letsmodreboot.proxy.ClientProxy",serverSide = "com.bobeyuno.letsmodreboot.proxy.ServerProxy")
    public static IProxy proxy;

    //initlize the mod's items, blocks and networking
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    //initilize for recipies
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    //initilize for world changes
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
