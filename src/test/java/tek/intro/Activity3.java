package tek.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(1000);
//        driver.findElement(By.id("searchInput")).sendKeys("TV");
//        driver.findElement(By.id("searchBtn")).click();
        By videoGameLocator = By.xpath("//p[text()='Video Games']");
        driver.findElement(videoGameLocator).click();
        Thread.sleep(1000);
        By ps5 = By.xpath("//p[text()='PlayStation 5 Console']");
        driver.findElement(ps5).click();
Thread.sleep(1000);
        By addToCart = By.xpath("//span[text()='Add to Cart']");
        String text = driver.findElement(addToCart).getText();
        System.out.println(text);





    }
}
