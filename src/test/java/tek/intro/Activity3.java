package tek.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("searchInput")).sendKeys("TV");
        driver.findElement(By.id("searchBtn")).click();


    }
}
