package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoadURL
{
	
	WebDriver driver = new ChromeDriver();
	//public WebDriver driver = null;
	
	@Test
	public void LoadURL() throws IOException
	{
		
		Properties prop =new Properties();
		
		FileInputStream file=new FileInputStream("src\\basic\\GlobalVariables.properties");
		
		
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Soft\\Selenium\\ChromeDriver1\\chromedriver.exe");
		
		driver.get(prop.getProperty("url"));
		
	
		
		
		System.out.println("hello");
		
	System.out.println(prop.getProperty("url"));
		
		
		
	}
	

}
