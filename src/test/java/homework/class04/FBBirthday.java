package homework.class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FBBirthday extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement createNewAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select sel=new Select(month);
        sel.selectByIndex(0);

        WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select sel2=new Select(day);
        sel2.selectByValue("20");

        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select sel3=new Select(year);
        sel3.selectByVisibleText("1976");





    }
}
