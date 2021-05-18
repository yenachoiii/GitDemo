import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jflores1\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://demoqa.com");
		driver.findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();
		System.out.println("Post Jira");
		System.out.println("Post Jira 2");
		System.out.println("Post Jira 3");
		System.out.println("Post Jira 4");
		System.out.println("Post Jira 5");
		System.out.println("Post Jira 6");
		
	}

}
