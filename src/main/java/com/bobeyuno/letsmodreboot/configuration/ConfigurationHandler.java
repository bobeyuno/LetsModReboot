package com.bobeyuno.letsmodreboot.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {

        boolean configValue = false;
        //create config object from given config file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //load the config from file
            configuration.load();

            //read in properties from config
             configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
           //log the exception
        }
        finally
        {
            //save config file
            configuration.save();
        }
        System.out.println("output!" + configValue);



    }
}
