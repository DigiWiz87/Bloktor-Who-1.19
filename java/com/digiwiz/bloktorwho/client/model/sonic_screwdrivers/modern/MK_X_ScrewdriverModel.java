package com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.modern;

import com.digiwiz.bloktorwho.BloktorWho;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_X_Screwdriver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MK_X_ScrewdriverModel extends AnimatedGeoModel<MK_X_Screwdriver> {
    @Override
    public ResourceLocation getModelResource(MK_X_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "geo/mk_x_sonic_screwdriver.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MK_X_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "textures/items/mk_x_sonic_screwdriver.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MK_X_Screwdriver animatable) {
        return new ResourceLocation(BloktorWho.MOD_ID, "animations/screwdrivers/modern/mk_x_sonic_screwdriver_active.animation.json");
    }
}
