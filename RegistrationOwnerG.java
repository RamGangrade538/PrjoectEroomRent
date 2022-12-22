package EroomrentOwnerg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationOwnerG {


	

	
	private static Object keys,Enter;

	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/ownerreg.php");
		
		String a1 = driver.getCurrentUrl();
		System.out.println(a1);
		String a2 = driver.getTitle();
		System.out.println(a2);
		String s = driver.findElement(By.tagName("h3")).getText();	
		System.out.println(s);
		driver.findElement(By.id("txtfname")).sendKeys("Sanath Jaysurya");
//		driver.findElement(By.id("txtmobile1")).sendKeys("7828770374");
//		driver.findElement(By.name("txtPassword")).sendKeys("7828770374");
		driver.findElement(By.name("txtConfirmPassword")).sendKeys("7828770374");
		driver.findElement(By.name("txtEmail")).sendKeys("abcdfre@gmail.com");
		driver.findElement(By.name("btnsubmit")).click();
//		Thread.sleep(300);
		


	}
	

}
