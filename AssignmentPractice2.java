import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select option = new Select(staticDropdown);
				
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Roshan");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='email']")).sendKeys("Roshan@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Password123");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		option.selectByIndex(0);
		Assert.assertEquals(option.getFirstSelectedOption().getText(),"Male");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("02/11/1994");
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}
