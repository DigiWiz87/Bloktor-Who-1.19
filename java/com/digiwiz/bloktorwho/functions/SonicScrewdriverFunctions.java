package com.digiwiz.bloktorwho.functions;

import com.digiwiz.bloktorwho.client.init.ItemInit;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_II_Screwdriver;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.classic.MK_I_Screwdriver;
import com.digiwiz.bloktorwho.items.sonic_screwdrivers.modern.MK_X_Screwdriver;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.RegistryObject;

public class SonicScrewdriverFunctions extends DoorBlock {

    public SonicScrewdriverFunctions(Properties properties) {
        super(properties);
    }
}
