package com.sub.cathywus.init;

import com.sub.cathywus.blocks.test_block;
import com.sub.cathywus.cathywus;
import com.sub.cathywus.reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Administrator on 2015/4/11.
 */
public class cathywusBlocks {

    public static Block test_block;

    public static void init(){
        test_block = new test_block(Material.clay).setUnlocalizedName("test_block").setCreativeTab(cathywus.tabCathywus);
    }
    public static void register(){
        GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){
        registerRender(test_block);
    }
    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(
                reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}
