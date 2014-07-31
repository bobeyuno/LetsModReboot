package com.bobeyuno.letsmodreboot.init;


import com.bobeyuno.letsmodreboot.block.BlockFlag;
import com.bobeyuno.letsmodreboot.block.BlockLMB;
import com.bobeyuno.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMB flag= new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
