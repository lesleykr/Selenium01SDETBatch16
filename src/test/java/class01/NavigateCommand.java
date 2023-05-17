package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        //create instance
        WebDriver driver=new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");
        //slow down for 2 sec
        Thread.sleep(2000);
        //navigate to facebook
        driver.navigate().to("https://www.facebook.com/");
        //slow down
        Thread.sleep(2000);
        driver.navigate().refresh();
        //slow down
        Thread.sleep(1000);
        //go back to previous page
        driver.navigate().back();
        //slow down
        Thread.sleep(2000);
        driver.navigate().forward();
        //close the browser
        driver.quit();
        //close the tab
        driver.close();
//        maximize the screen
      // driver.manage().window().fullscreen();

     //   WebDriver driver2=new ChromeDriver();
    //    driver.get("www.example.com");
        //hey webdriver, find element button w/id of xyz and click on it
      // driver.findElement(By.id("xyz"));
//        hey webdriver, find element input which has id with value text and send abc in it
     //   driver.findElement(By.id("text"));
//        hey webdriver, find element button which has a name of abc and click on it
      //  driver.findElement(By.name("abc"));
    }
}
