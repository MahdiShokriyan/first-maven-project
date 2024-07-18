package tek.intro.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#signinLink")).click();

        driver.findElement(By.cssSelector("#email")).sendKeys("mahdi.mahdi@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Mahdi123!");
        driver.findElement(By.cssSelector("#loginBtn")).click();

        driver.findElement(By.cssSelector("#accountLink")).click();

        String text = driver.findElement(By.cssSelector(".account__information-email")).getText();

        System.out.println("Your Email address is : " + text);
       driver.quit();



    }
}
