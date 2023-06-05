package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alert1Btn=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();

        Thread.sleep(3000);
        //switch focus of driver to the alert
        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.accept();

        //find the other alert button and click on it
        WebElement Alert2Btn= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2Btn.click();
        Thread.sleep(2000);

        //switch to the alert

        Alert confirmationAlert2=driver.switchTo().alert();



    }
}
