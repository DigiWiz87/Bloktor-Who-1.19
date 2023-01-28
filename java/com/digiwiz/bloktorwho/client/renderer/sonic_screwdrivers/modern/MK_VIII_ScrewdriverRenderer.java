package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.modern;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.modern.MK_VIII_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_VIII_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_VIII_ScrewdriverRenderer extends GeoItemRenderer<MK_VIII_Screwdriver> {
    public MK_VIII_ScrewdriverRenderer() { super(new MK_VIII_ScrewdriverModel()); }
}
