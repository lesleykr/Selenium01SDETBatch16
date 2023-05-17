package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class LocatingElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
//maximize window
        driver.manage().window().maximize();
//        send some text in the email text box
        driver.findElement(By.id("email")).sendKeys("chakram76@hotmail.com");
//      send text to password field
        driver.findElement(By.name("pass")).sendKeys("password");
        driver.findElement(By.name("login")).click();
        String url=driver.getCurrentUrl();
        System.out.println(url);

        String title=driver.getTitle();
        System.out.println(title);
        //confirm that the title is "Facebook - log in or sign up"
        if(title.equals("Facebook - log in or sign up")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title is incorrect");
        }
        //driver.quit();
    }
}
