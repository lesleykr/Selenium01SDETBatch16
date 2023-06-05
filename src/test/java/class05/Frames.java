package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //print animal on consul and choose baby cat from dropdown
        //as the webelement is inside an iframe, first we need to switch to it

        driver.switchTo().frame(1);
        //find the webelement anumal
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
WebElement dd=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        //switch focus to main pg
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement textBox= driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abracadabra");

        //Click on the checkbox
       /* My version (which worked fine):
       driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='a']")).click();
        */

        //switch to iframe using webelement method
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();


    }
}
