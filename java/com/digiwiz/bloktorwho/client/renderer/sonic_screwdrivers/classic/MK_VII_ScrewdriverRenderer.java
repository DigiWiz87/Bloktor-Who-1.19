package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic.MK_VII_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_VII_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_VII_ScrewdriverRenderer extends GeoItemRenderer<MK_VII_Screwdriver> {

    public MK_VII_ScrewdriverRenderer() { super (new MK_VII_ScrewdriverModel()); }

}
