package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {


        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://dev.insurance.tekschool-students.com/");
        chromeDriver.manage().window().maximize();

        String title = chromeDriver.getTitle();
        System.out.println(title);
        chromeDriver.quit();
    }
}
