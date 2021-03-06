package org.dimdev.dimdoors.shared.items;

import org.dimdev.dimdoors.DimDoors;
import org.dimdev.dimdoors.shared.blocks.BlockDimensionalTrapdoorWood;
import org.dimdev.dimdoors.shared.blocks.ModBlocks;
import net.minecraft.util.ResourceLocation;
import org.dimdev.dimdoors.shared.rifts.targets.EscapeTarget;
import org.dimdev.dimdoors.shared.tileentities.TileEntityEntranceRift;

public class ItemDimensionalTrapdoorWood extends ItemDimensionalTrapdoor {

    public ItemDimensionalTrapdoorWood() {
        super(ModBlocks.WOOD_DIMENSIONAL_TRAPDOOR);
        setCreativeTab(ModCreativeTabs.DIMENSIONAL_DOORS_CREATIVE_TAB);
        setTranslationKey(BlockDimensionalTrapdoorWood.ID);
        setRegistryName(new ResourceLocation(DimDoors.MODID, BlockDimensionalTrapdoorWood.ID));
    }

    @Override
    public void setupRift(TileEntityEntranceRift rift) {
        rift.setDestination(new EscapeTarget());
    }
}
