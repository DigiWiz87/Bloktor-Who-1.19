package com.digiwiz.bloktorwho.client.init;

import com.digiwiz.bloktorwho.BloktorWho;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib3.GeckoLib;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            BloktorWho.MOD_ID);

    public static RegistryObject<SoundEvent> MK_I_SONIC_SCREWDRIVER = SOUNDS.register("mk_i_active",
            () -> new SoundEvent(new ResourceLocation(BloktorWho.MOD_ID, "mk_i_active")));

    public static RegistryObject<SoundEvent> MK_II_SONIC_SCREWDRIVER = SOUNDS.register("mk_ii_active",
            () -> new SoundEvent(new ResourceLocation(BloktorWho.MOD_ID, "mk_ii_active")));

    public static RegistryObject<SoundEvent> MK_VIII_SCREWDRIVER = SOUNDS.register("sonic_active",
            () -> new SoundEvent(new ResourceLocation(BloktorWho.MOD_ID, "sonic_active")));

    public static RegistryObject<SoundEvent> MK_VI_SONIC_SCREWDRIVER_1 = SOUNDS.register("mk_vi_active2",
            () -> new SoundEvent(new ResourceLocation(BloktorWho.MOD_ID, "mk_vi_active2")));

    public static RegistryObject<SoundEvent> MK_IX_SONIC_SCREWDRIVER = SOUNDS.register("mk_ix_active",
            () -> new SoundEvent(new ResourceLocation(BloktorWho.MOD_ID, "mk_ix_active")));

    public static RegistryObject<SoundEvent> MK_X_SONIC_SCREWDRIVER = SOUNDS.register("mk_x_active",
            () -> new SoundEvent(new ResourceLocation(BloktorWho.MOD_ID, "mk_x_active")));

}
