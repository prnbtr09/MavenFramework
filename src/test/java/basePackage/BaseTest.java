package basePackage;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class BaseTest {

	public static WebDriver driver;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest logger;
	 
	
	 
	
	@BeforeTest
	public void beforeTest() {
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+File.separator+"reports"+File.separator+"AutomtionReport.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation QA", "Prince Kumar");
		
		
	}
	
	@BeforeMethod
	@Parameters(value="browserName")
	public void beforeMethod(String browserName, Method testMethod) {
		logger=extent.createTest(testMethod.getName());
		setUpDriver(browserName);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.APPLICATION_URL);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
	
	
	
	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if(testResult.getStatus()==ITestResult.SUCCESS) {
			String methodName=testResult.getMethod().getMethodName();
			String logText="Test case for "+methodName+" is Passed";
			Markup markUp=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			logger.log(Status.PASS, markUp);
		}else if(testResult.getStatus()==ITestResult.FAILURE) {
			String methodName=testResult.getMethod().getMethodName();
			String logText="Test case for "+methodName+" is Failed";
			Markup markUp=MarkupHelper.createLabel(logText, ExtentColor.RED);
			logger.log(Status.FAIL, markUp);
		}
		
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		extent.flush();
		
	}
	
public void setUpDriver(String browserName) {
	if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		
	}
}
	
	
	
}
