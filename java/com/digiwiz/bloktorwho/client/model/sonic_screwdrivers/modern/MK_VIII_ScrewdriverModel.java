package com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.modern;

import com.digiwiz.bloktorwho.BloktorWho;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_VIII_Screwdriver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MK_VIII_ScrewdriverModel extends AnimatedGeoModel<MK_VIII_Screwdriver> {

    @Override
    public ResourceLocation getModelResource(MK_VIII_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "geo/mk_viii_sonic_screwdriver.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MK_VIII_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "textures/items/mk_viii_screwdriver.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MK_VIII_Screwdriver animatable) {
        return new ResourceLocation(BloktorWho.MOD_ID, "animations/screwdrivers/modern/mk_viii_screwdriver_extend.animation.json");
    }
}
