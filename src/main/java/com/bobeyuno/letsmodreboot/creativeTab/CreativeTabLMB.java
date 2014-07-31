package com.bobeyuno.letsmodreboot.creativeTab;

import com.bobeyuno.letsmodreboot.init.ModItems;
import com.bobeyuno.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jack on 31/07/2014.
 */
public class CreativeTabLMB
{
    public static final CreativeTabs LMB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }

    };

}
