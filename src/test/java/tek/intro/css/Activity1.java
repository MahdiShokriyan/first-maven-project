package tek.intro.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.findElement(By.cssSelector("#signinLink")).click();
      //Thread.sleep(1000);
        driver.findElement(By.cssSelector("#email")).sendKeys("mahdi.mahdi@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Mahdi123!");
        driver.findElement(By.cssSelector("#loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#accountLink")).click();

        String text = driver.findElement(By.cssSelector("#accountInformation >div" +
                ":first-child > div > h1:last-child")).getText();
       // Thread.sleep(1000);
        System.out.println("Your Email address is : " + text);
        driver.quit();



    }
}
