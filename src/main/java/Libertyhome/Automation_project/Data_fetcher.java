package Libertyhome.Automation_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_fetcher {

    public String getdata(String Key) throws IOException {

        String path = System.getProperty("user.dir")
                + "\\src\\main\\java\\data\\data.properties";

        FileInputStream fis = new FileInputStream(path);

        Properties p = new Properties();

        p.load(fis);

        String value = p.getProperty(Key);

        return value;
    }
}