package homework.class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertBox extends CommonMethods{
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alertButton=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        alertButton.click();
        Thread.sleep(2000);
        Alert alertBx=driver.switchTo().alert();
        driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("Lesley Reuter");
Thread.sleep(2000);
       // WebElement textBx=

    }
}
