package com.digiwiz.bloktorwho.client.init;

import com.digiwiz.bloktorwho.BloktorWho;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.*;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_IX_Screwdriver;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_VIII_Screwdriver;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_X_Screwdriver;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BloktorWho.MOD_ID);

    public static final RegistryObject<MK_I_Screwdriver> MK_I_SONIC_SCREWDRIVER = ITEMS.register("mk_i_sonic_screwdriver",
            () -> new MK_I_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_II_Screwdriver> MK_II_SONIC_SCREWDRIVER = ITEMS.register("mk_ii_sonic_screwdriver",
            () -> new MK_II_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_III_Screwdriver> MK_III_SONIC_SCREWDRIVER = ITEMS.register("mk_iii_sonic_screwdriver",
            () -> new MK_III_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_IV_Screwdriver> MK_IV_SONIC_SCREWDRIVER = ITEMS.register("mk_iv_sonic_screwdriver",
            () -> new MK_IV_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_V_Screwdriver> MK_V_SONIC_SCREWDRIVER = ITEMS.register("mk_v_sonic_screwdriver",
            () -> new MK_V_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_VI_Screwdriver> MK_VI_SONIC_SCREWDRIVER = ITEMS.register("mk_vi_sonic_screwdriver",
            () -> new MK_VI_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_VII_Screwdriver> MK_VII_SONIC_SCREWDRIVER = ITEMS.register("mk_vii_sonic_screwdriver",
            () -> new MK_VII_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_VIII_Screwdriver> MK_VIII_SONIC_SCREWDRIVER = ITEMS.register("mk_viii_sonic_screwdriver",
            () -> new MK_VIII_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_IX_Screwdriver> MK_IX_SONIC_SCREWDRIVER = ITEMS.register("mk_ix_sonic_screwdriver",
            () -> new MK_IX_Screwdriver(new Item.Properties()));

    public static final RegistryObject<MK_X_Screwdriver> MK_X_SONIC_SCREWDRIVER = ITEMS.register("mk_x_sonic_screwdriver",
            () -> new MK_X_Screwdriver(new Item.Properties()));

}
