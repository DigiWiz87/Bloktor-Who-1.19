package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic.MK_IV_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_IV_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_IV_ScrewdriverRenderer extends GeoItemRenderer<MK_IV_Screwdriver> {

    public MK_IV_ScrewdriverRenderer() { super (new MK_IV_ScrewdriverModel()); }

}
