package org.dimdev.dimdoors.shared.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import org.dimdev.dimdoors.DimDoors;

public class ItemWovenWorldThreadArmor extends ItemArmor {
    public static final ArmorMaterial WOVEN_WORLD_THREAD = EnumHelper.addArmorMaterial(
            "woven_world_thread",
            DimDoors.MODID + ":woven_world_thread",
            20,
            new int[] {2, 3, 4, 5},
            20,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            1.0f)
            .setRepairItem(new ItemStack(ModItems.WORLD_THREAD));

    public ItemWovenWorldThreadArmor(String name, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(WOVEN_WORLD_THREAD, renderIndex, equipmentSlot);
        setRegistryName(DimDoors.MODID, name);
        setTranslationKey(name);
        setCreativeTab(ModCreativeTabs.DIMENSIONAL_DOORS_CREATIVE_TAB);
    }
}
