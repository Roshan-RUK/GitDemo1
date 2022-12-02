import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Q1: To check and uncheck and validate the same
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		//Count the number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println("Git data1");
		System.out.println("Git data2");
		System.out.println("Git data3");
		System.out.println("Git data4");
		System.out.println("Git data5");
		System.out.println("Git data final");
	}

}
