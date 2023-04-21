package facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_new_account
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("sanjai");
		driver.findElement(By.name("lastname")).sendKeys("sethu");
		driver.findElement(By.name("reg_email__")).sendKeys("7502575027");
		driver.findElement(By.name("reg_passwd__")).sendKeys("7502575027");
		driver.findElement(By.name("birthday_day")).sendKeys("30");
		driver.findElement(By.name("birthday_month")).sendKeys("Nov");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}
	}