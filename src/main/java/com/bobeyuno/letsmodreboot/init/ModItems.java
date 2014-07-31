package com.bobeyuno.letsmodreboot.init;


import com.bobeyuno.letsmodreboot.item.ItemLMB;
import com.bobeyuno.letsmodreboot.item.ItemMapleLeaf;
import com.bobeyuno.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMB mapleLeaf= new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf,"mapleLeaf");
    }
}
