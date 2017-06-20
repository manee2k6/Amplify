package com.amplify.practise;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.amplify.utils.AutoConstants;
import com.amplify.utils.PropFileHandler;

public class SysProTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir")+PropFileHandler.fetchProp(AutoConstants.DriverPath.ChromeDriver));
		System.out.println(PropFileHandler.fetchProp(AutoConstants.URL.URL));
		System.out.println(PropFileHandler.fetchProp(AutoConstants.Credentials.Username));
	}
}