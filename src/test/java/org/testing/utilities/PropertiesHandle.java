package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class PropertiesHandle {

	
	public static Properties loadProperties(String file) throws IOException {
		
		File uriFile = new File(file) ;
		FileReader fr = new FileReader(uriFile);
		Properties pro = new Properties();
		pro.load(fr);
		return pro;	
	}
	
}
