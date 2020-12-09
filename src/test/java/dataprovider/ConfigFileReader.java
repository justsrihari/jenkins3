package dataprovider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "config//Property.properties";


	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} 
	}

	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		return driverPath;
	}
	
	public String getUrl1(){
		String url1 = properties.getProperty("url1");
		return url1;
	}
	public String getUrl2(){
		String url2 = properties.getProperty("url2");
		return url2;
	}
	public String getUser(){
		String user =properties.getProperty("user");
		return user;
	}
	public String getPass(){
		String pass = properties.getProperty("pass");					
		return pass;
	}
	public long getExpWait(){
		int wait=Integer.parseInt(properties.getProperty("expWait"));
		return wait;
	}
	public String getBurger(){
		String burger = properties.getProperty("burger");					
		return burger;
	}
	public String getChicken(){
		String chicken = properties.getProperty("chicken");					
		return chicken;
	}
	public String getLsb(){
		String xpath = properties.getProperty("lsb");
		return xpath;
	}
	public String getLvp(){
		String xpath = properties.getProperty("lvp");
		return xpath;
	}
	public String getMb(){
		String xpath = properties.getProperty("mb");
		return xpath;
	}
	public String getPw(){
		String xpath = properties.getProperty("pw");
		return xpath;
	}
	public String getLb(){
		String xpath = properties.getProperty("lb");
		return xpath;
	}
	public String getIump(){
		String xpath = properties.getProperty("iump");
		return xpath;
	}
	public String getMa(){
		String xpath = properties.getProperty("ma");				
		return xpath;
	}
	public String getLs(){
		String xpath = properties.getProperty("ls");
		return xpath;
	}
	public String getDb(){
		String xpath = properties.getProperty("db");
		return xpath;
	}
	public String getAdd(){
		String xpath = properties.getProperty("add");
		return xpath;
	}
	public String getSsb(){
		String xpath = properties.getProperty("ssb");
		return xpath;
	}
	public String getDslm(){
		String xpath = properties.getProperty("dslm");
		return xpath;
	}
	public String getNlf(){
		String xpath = properties.getProperty("nlf");
		return xpath;
	}
	public String getFb(){
		String xpath = properties.getProperty("fb");
		return xpath;
	}
	public String getSi(){
		String xpath = properties.getProperty("si");				
		return xpath;
	}
	public String getAb(){
		String xpath = properties.getProperty("ab");
		return xpath;
	}
	public String getRc(){
		String xpath = properties.getProperty("rc");
		return xpath;
	}
	public String getAtcb(){
		String xpath = properties.getProperty("atcb");
		return xpath;
	}
	public String getNrf(){
		String xpath = properties.getProperty("nrf");
		return xpath;
	}
	public String getVcb(){
		String xpath = properties.getProperty("vcb");
		return xpath;
	}
	

	public long getImplicitlyWait() { 
		String implicitlyWait = properties.getProperty("implicitlyWait");
		return Long.parseLong(implicitlyWait);
	}

}
