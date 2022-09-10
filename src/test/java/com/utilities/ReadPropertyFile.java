package com.utilities;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\Automstion_testing\\Statelymen\\src\\test\\resources\\ConfigFiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
		
	}

}
