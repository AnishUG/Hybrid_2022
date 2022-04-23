package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtil {
	
	public static String readproperty (String key) throws Exception {
		
		Properties prop = new Properties ();
		
		String path = System.getProperty("user.dir") + "/src/main/resources/config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		return prop.getProperty(key);
		
		
	}

}
