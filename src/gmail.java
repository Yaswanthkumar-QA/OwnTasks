import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class gmail {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.edge.driver","F:\\work\\WebDriver\\msedgedriver.exe");
		//EdgeDriver driver=new EdgeDriver();
		driver.get("http:\\google.com");
		
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("gmail.com");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).submit();
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div[1]/div/div[1]/a/h3")).click();
		
		driver.findElement(By.xpath("//div[@class='h-c-header__cta']/ul[1]/li[2]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);	
		
		driver.findElement(By.id("identifierId")).sendKeys("automationproject123");
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("automation123@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[2]")).click();
		Thread.sleep(10000);
		
		driver.quit();
		
		
		

	}
	
	

}
