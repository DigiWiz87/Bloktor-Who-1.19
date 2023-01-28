package com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.BloktorWho;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_I_Screwdriver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MK_I_ScrewdriverModel extends AnimatedGeoModel<MK_I_Screwdriver> {

    @Override
    public ResourceLocation getModelResource(MK_I_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "geo/mk_i_sonic_screwdriver.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MK_I_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "textures/items/mk_i_sonic_screwdriver.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MK_I_Screwdriver animatable) {
        return new ResourceLocation(BloktorWho.MOD_ID, "animations/screwdrivers/classic/mk_i_screwdriver_active.animation.json");
    }
}
