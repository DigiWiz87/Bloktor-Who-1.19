package com.digiwiz.bloktorwho.client.renderer.sonic_screwdrivers.modern;

import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.modern.MK_IX_ScrewdriverModel;
import com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.modern.MK_VIII_ScrewdriverModel;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_IX_Screwdriver;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MK_IX_ScrewdriverRenderer extends GeoItemRenderer<MK_IX_Screwdriver> {

    public MK_IX_ScrewdriverRenderer() { super(new MK_IX_ScrewdriverModel()); }

}
