package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic.MK_V_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_V_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_V_ScrewdriverRenderer extends GeoItemRenderer<MK_V_Screwdriver> {

    public MK_V_ScrewdriverRenderer() { super (new MK_V_ScrewdriverModel()); }

}
