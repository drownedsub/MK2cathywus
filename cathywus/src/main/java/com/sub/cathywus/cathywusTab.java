package com.sub.cathywus;

import com.sub.cathywus.init.cathywusItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2015/4/13.
 */
public class cathywusTab extends CreativeTabs{

    public cathywusTab(String label){
        super(label);
        this.setBackgroundImageName("cathywus.png");
    }

    @Override
    public Item getTabIconItem() {
        return cathywusItems.test_item;
    }

}
