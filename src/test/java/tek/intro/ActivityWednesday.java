package tek.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActivityWednesday {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(1000);

        WebElement select = driver.findElement(By.cssSelector(".home__categories-grid > div:nth-child(2) > h1"));
        String text = select.getText();
        System.out.println(text);
        driver.quit();
    }
}
