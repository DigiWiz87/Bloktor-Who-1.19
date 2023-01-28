package com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.BloktorWho;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_VII_Screwdriver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MK_VII_ScrewdriverModel extends AnimatedGeoModel<MK_VII_Screwdriver> {
    @Override
    public ResourceLocation getModelResource(MK_VII_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "geo/mk_vii_sonic_screwdriver.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MK_VII_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "textures/items/mk_vii_sonic_screwdriver.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MK_VII_Screwdriver animatable) {
        return new ResourceLocation(BloktorWho.MOD_ID, "animations/screwdrivers/classic/mk_vii_sonic_screwdriver_active.animation.json");
    }
}
