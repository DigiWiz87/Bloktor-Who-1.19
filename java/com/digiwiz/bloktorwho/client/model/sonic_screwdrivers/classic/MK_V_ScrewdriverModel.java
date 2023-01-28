package com.digiwiz.bloktorwho.client.model.sonic_screwdrivers.classic;

import com.digiwiz.bloktorwho.BloktorWho;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_V_Screwdriver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MK_V_ScrewdriverModel extends AnimatedGeoModel<MK_V_Screwdriver> {
    @Override
    public ResourceLocation getModelResource(MK_V_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "geo/mk_v_sonic_screwdriver.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MK_V_Screwdriver object) {
        return new ResourceLocation(BloktorWho.MOD_ID, "textures/items/mk_v_screwdriver.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MK_V_Screwdriver animatable) {
        return new ResourceLocation(BloktorWho.MOD_ID, "animations/screwdrivers/classic/mk_v_sonic_screwdriver_active.animation.json");
    }
}
