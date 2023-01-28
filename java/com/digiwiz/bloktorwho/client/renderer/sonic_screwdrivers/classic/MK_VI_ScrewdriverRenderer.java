package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic.MK_VI_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_VI_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_VI_ScrewdriverRenderer extends GeoItemRenderer<MK_VI_Screwdriver> {

    public MK_VI_ScrewdriverRenderer() { super (new MK_VI_ScrewdriverModel()); }

}
