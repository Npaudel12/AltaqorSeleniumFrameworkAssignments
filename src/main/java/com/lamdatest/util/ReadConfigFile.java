package com.lamdatest.util;


import java.io.FileReader;
import java.util.Properties;

public class ReadConfigFile {
	
	public static Properties getProperty(String propertyFileName) {
		
		Properties properties = new Properties();
		
		//C:\SeleniumMaven\AltaqorSeleniumFrameworkAssignments\src\test\resources\config.properties
		
		String baseProjectPath = System.getProperty("user.dir");   // need to remember
		String filePath = baseProjectPath + "\\src\\test\\resources\\" + propertyFileName + ".properties";
		// filereader
		try {
			FileReader fileRead = new FileReader(filePath);
		    properties.load(fileRead);
			
		}catch(Exception e) {
			System.out.println("Message: " + e.getMessage());
		}
		
		return properties;
	}
	
	/*just for cross check
	 * public static void main(String[] args) {
		ReadConfigFile readConfigFile = new ReadConfigFile();
				
		System.out.println(readConfigFile.getProperty("config"));
		
	}
*/
}
