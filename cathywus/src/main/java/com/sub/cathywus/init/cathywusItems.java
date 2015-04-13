package com.sub.cathywus.init;

import com.sub.cathywus.reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.sub.cathywus.cathywus;

/**
 * Created by Administrator on 2015/4/11.
 */
public class cathywusItems {

    public static Item test_item;

    public static void init(){
        test_item = new Item().setUnlocalizedName("test_item").setCreativeTab(cathywus.tabCathywus);
    }
    public static void register(){
        GameRegistry.registerItem(test_item,test_item.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){
        registerRender(test_item);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(
                reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}
