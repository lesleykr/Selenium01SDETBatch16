package homework.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(1000);
        String title=driver.getTitle();
        if(title.equals("Web Orders Login")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title is incorrect");
        }
        driver.quit();
    }
}
