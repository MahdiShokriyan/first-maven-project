package tek.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
    public static void main(String[] args) throws InterruptedException {

        var driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).
                sendKeys("abd@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("qwertyu");
        Thread.sleep(2000);
        driver.findElement(By.id("loginbutton")).click();

    }
}
