package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic.MK_III_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_III_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_III_ScrewdriverRenderer extends GeoItemRenderer<MK_III_Screwdriver> {

    public MK_III_ScrewdriverRenderer() { super (new MK_III_ScrewdriverModel()); }

}
