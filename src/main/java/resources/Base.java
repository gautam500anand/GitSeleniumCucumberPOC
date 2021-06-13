package resources;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver  driver;
	public Properties prop;
	public WebDriver InitializeDriver() throws IOException
	{
		
		 prop = new Properties ();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data.properties");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	//String browserName = System.getProperty("browser");
	System.out.println(browserName);
	String chromeExePath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe" ;
	String iePath;
	if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		 driver = new ChromeDriver();
	}
	
	else if (browserName.equals("IE")) {
		System.setProperty("webdriver.chrome.driver", iePath);
		 driver = new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	public String getScreenshotPath(String tstCaseName, WebDriver driver) {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + tstCaseName +".png";
		try {
			FileUtils.copyFile(src, new File(destinationFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return destinationFile;
	}
	
}
