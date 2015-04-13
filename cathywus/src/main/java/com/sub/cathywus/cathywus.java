package com.sub.cathywus;

import com.sub.cathywus.init.cathywusBlocks;
import com.sub.cathywus.init.cathywusItems;
import com.sub.cathywus.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Administrator on 2015/4/11.
 */
@Mod(modid = reference.MOD_ID,name = reference.MOD_NAME,version = reference.Mod_Version)

public class cathywus {

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS,serverSide = reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static final cathywusTab tabCathywus = new cathywusTab("tabCathywus");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        cathywusBlocks.init();
        cathywusBlocks.register();
        cathywusItems.init();
        cathywusItems.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
