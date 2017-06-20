package com.amplify.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropFileHandler {
	public static Properties OR;
	public static InputStream input;
	public static String Filepath=System.getProperty("user.dir")+"\\OR.properties";
	
	public static String fetchProp(String Key) throws IOException,FileNotFoundException{
		OR= new Properties();
		input=new FileInputStream(Filepath);
        OR.load(input);
        
		//Supply the key and get the value
		String value=OR.getProperty(Key);
		return value;
	}

}
