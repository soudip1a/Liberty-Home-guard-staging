package Libertyhome.Automation_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Data_fetcher {
	
public String getdata(String Key) throws IOException {
	
	
	
	FileInputStream fis = new FileInputStream("E:\\Eclipse workspace\\Automation_project\\src\\main\\java\\data\\data.properities");
	
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(Key);
	return value;
	
	
	
}	
	


}
