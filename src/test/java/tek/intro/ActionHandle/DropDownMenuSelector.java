package tek.intro.ActionHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownMenuSelector {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
       WebElement element =  driver.findElement(By.id("countrySelect"));

        Select dropDownList = new Select(element);
Thread.sleep(2000);
        dropDownList.selectByValue("United States");



    }
}
