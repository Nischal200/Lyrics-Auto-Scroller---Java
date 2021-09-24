package sample;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleScroll {
    String webUrl;
    int scrollSpeed;
    HandleScroll(String webUrl,int scrollSpeed){

        this.webUrl = webUrl;
        this.scrollSpeed = scrollSpeed;
        handleScroll(this.webUrl,this.scrollSpeed);
    }

    public void handleScroll(String webUrl, int scrollSpeed){

//      System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        // need to set rules so no wrong add
        driver.navigate().to("http://www."+webUrl+".com"); // Specify the website URL

        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().fullscreen();


        while (0 < 10) {
            try {
                js.executeScript(String.format("window.scrollBy(0,%2d)",scrollSpeed));
                Thread.sleep(100);

            } catch (Exception a) {
                a.printStackTrace();
            }
        }
    }
}






