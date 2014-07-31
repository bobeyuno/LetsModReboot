package com.bobeyuno.letsmodreboot;

import com.bobeyuno.letsmodreboot.handler.ConfigurationHandler;
import com.bobeyuno.letsmodreboot.init.ModBlocks;
import com.bobeyuno.letsmodreboot.init.ModItems;
import com.bobeyuno.letsmodreboot.proxy.IProxy;
import com.bobeyuno.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    //Create an instance of the mod
    @Mod.Instance(Reference.MOD_ID)
    public static  LetsModReboot instance;

    //load proxy stuff
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //initialize the mod's items, blocks and networking
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        FMLLog.info("Pre Init Done!");

        ModItems.init();

        ModBlocks.init();
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
