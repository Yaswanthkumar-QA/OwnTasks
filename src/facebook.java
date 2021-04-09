import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.edge.driver","F:\\work\\WebDriver\\msedgedriver.exe");
		//EdgeDriver driver=new EdgeDriver();
		driver.get("http:\\google.com");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("facebook");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).submit();
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		driver.findElement(By.id("email")).sendKeys("test99@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("test123456");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		int loginbutton= driver.findElements(By.xpath("//button[@name='login']")).size();
		
		if(loginbutton>0)
		{
			System.out.println("Invalid Credentials");
		}
		else
		{
			System.out.println("Login is successful");
		}
		Thread.sleep(6000);
		
		driver.quit();
	}

}
