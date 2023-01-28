package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic.MK_I_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_I_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_I_ScrewdriverRenderer extends GeoItemRenderer<MK_I_Screwdriver> {
    public MK_I_ScrewdriverRenderer() {
        super (new MK_I_ScrewdriverModel());
    }
}
