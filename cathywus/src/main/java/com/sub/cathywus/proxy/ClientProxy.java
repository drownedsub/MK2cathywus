package com.sub.cathywus.proxy;

import com.sub.cathywus.init.cathywusBlocks;
import com.sub.cathywus.init.cathywusItems;

/**
 * Created by Administrator on 2015/4/11.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders(){
        cathywusItems.registerRenders();
        cathywusBlocks.registerRenders();
    }
}
