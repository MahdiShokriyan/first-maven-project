package tek.intro.lab_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Activity01 {
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
        driver.findElement(By.cssSelector("#accountLink")).click();

        By updateNumber = By.cssSelector("#personalPhoneInput");
        WebElement numberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(updateNumber));
        numberElement.clear();
        numberElement.sendKeys(RandomGenratedNumber());


        By updateBtn = By.cssSelector("#personalUpdateBtn");
        WebElement btnElement = driver.findElement(updateBtn);
        wait.until(ExpectedConditions.elementToBeClickable(btnElement)).click();

        By tosifyMessage = By.cssSelector(".Toastify__toast-body >div:last-child");
        WebElement toastifyElement = driver.findElement(tosifyMessage);
        String text = wait.until(ExpectedConditions.visibilityOf(toastifyElement)).getText();
        System.out.println("message in toastify is: " + text );
        System.out.println("is message Displayed: " + toastifyElement.isDisplayed());
           driver.quit();
    }
public static String RandomGenratedNumber(){
    Random random = new Random();
    // Generate 10 random digits and concatenate them to form a 10-digit number
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++) {
        int digit = random.nextInt(10); // Generate a random digit between 0 and 9
        sb.append(digit);
    }
    // Convert StringBuilder to String
    return sb.toString();
}

}
