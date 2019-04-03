package com.pcloudy.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
	static Properties prop;

	properties() {
		this.prop = getPropObject();
	}

	Properties getPropObject() {
		Properties prop = new Properties();
		{
			try {
				prop.load(new FileInputStream("./config.properties"));
				return prop;
			} catch (IOException e) {
				throw new RuntimeException("Unable to load .properties file: " + e.getMessage());
			}
		}
	}

	public static String getcloudName() {
		return prop.getProperty("cloudName");
	}

	public static String getuserName() {
		return prop.getProperty("userName");

	}

	public static String getapiKey() {
		return prop.getProperty("apiKey");
	}

	public static int getDuration() {
		String Duration = prop.getProperty("Duration");
		return Integer.parseInt(Duration);

	}

	public static String App_to_uploaded() {
		return prop.getProperty("App_to_uploaded");
	}

	public static String[] deviceName() {
		return prop.getProperty("deviceName").split(",");
	}

}