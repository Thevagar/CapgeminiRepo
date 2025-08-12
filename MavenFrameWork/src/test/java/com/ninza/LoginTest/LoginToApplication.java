package com.ninza.LoginTest;

import java.io.IOException;

import com.ninza.genericUtility.FileUtility;

public class LoginToApplication {

	public static void main(String[] args) throws IOException {
	
		FileUtility fUtil=new FileUtility();
		String BROWSER = fUtil.getDatafromPropertyFile("browser");
	

	}

}
