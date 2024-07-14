package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleOnly {
    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();

        chrome.manage().window().maximize();
        chrome.get("https://www.google.com/");
        String title = chrome.getTitle();
        System.out.println(title);
        chrome.quit();




    }
}
