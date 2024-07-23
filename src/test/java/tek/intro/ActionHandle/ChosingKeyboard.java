package tek.intro.ActionHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChosingKeyboard {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#signinLink")).click();

        driver.findElement(By.cssSelector("#email")).sendKeys("mahdi.mahdi@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Mahdi123!");
        driver.findElement(By.cssSelector("#loginBtn")).click();

       WebElement accessoriesElement =  driver.findElement
               (By.xpath("//img[@alt = 'Accessories']"));
       wait.until(ExpectedConditions.visibilityOf(accessoriesElement)).click();

       WebElement keyboardElement =
               driver.findElement(By.xpath("//img[contains(@alt , 'Mouse Combo Backlit')]"));
       wait.until(ExpectedConditions.visibilityOf(keyboardElement)).click();

       WebElement quantityElement = driver.findElement(By.cssSelector(".product__select"));
        Select dropDown = new Select(quantityElement);
        dropDown.selectByValue("5");

      WebElement addToCart =  driver.findElement(By.id("addToCartBtn"));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }
}
