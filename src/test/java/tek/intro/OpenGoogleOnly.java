package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleOnly {
    public static void main(String[] args) {

        var chrome = new ChromeDriver();
        chrome.get("https://www.facebook.com/");


    }
}
