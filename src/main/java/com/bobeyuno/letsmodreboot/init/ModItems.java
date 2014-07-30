package com.bobeyuno.letsmodreboot.init;


import com.bobeyuno.letsmodreboot.item.ItemLMB;
import com.bobeyuno.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMB mapleLeaf= new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf,"mapleLeaf");
    }
}
