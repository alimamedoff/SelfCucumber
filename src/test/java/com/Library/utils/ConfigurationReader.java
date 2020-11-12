package com.Library.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static final Properties properties = new Properties();

    static {
        try {
            //2- we get the path and pass into file input stream
            FileInputStream file = new FileInputStream("configuration.properties");
            //3- we load the open file into properties object
            properties.load(file);
        } catch (
                IOException e) {
            System.out.println("Properties file not found");
        }
    }



    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}