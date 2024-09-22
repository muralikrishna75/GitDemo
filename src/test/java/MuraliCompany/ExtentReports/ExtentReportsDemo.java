package MuraliCompany.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsDemo {
	ExtentReports extent =new  ExtentReports();
	 @BeforeMethod
	 public void config() {
		 String path=System.getProperty("user.dir")+"\\reports\\index.html";
		 ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		 reporter.config().setReportName("My Web Automation ");
		 reporter.config().setDocumentTitle("Test Results");
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tesster", "Murali Krishna");
		 
		 
	 }
	@Test
	public void intialize() {
		ExtentTest test=extent.createTest("Intial Demo");
		//System.setProperty(WebDriver.driver.chrome, null)
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.close();
		  test.fail("Results do not match");
		extent.flush();
	System.out.println("Git demo source for this line");
	}
	
}
