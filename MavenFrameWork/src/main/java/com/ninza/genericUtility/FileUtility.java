package com.ninza.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	
	public String getDatafromPropertyFile(String key) throws IOException {
	
		FileInputStream fis=new FileInputStream("./src/main/resources/credentials.properties");
		
		Properties pObj=new Properties();
		
		pObj.load(fis);
		
		String value = pObj.getProperty(key);
		
		return value;
	}
	
	
}
