package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
//        becuase the DOM doesnt have firstName by default
//        it only shows up after click on create new account
//        and the code takes some time to appear in DOM for firstName
//        so we must add a sleep here
        Thread.sleep(2000);

       WebElement days= driver.findElement(By.xpath("//select[@id='day']"));

        Select sel=new Select(days);
        sel.selectByVisibleText("8");

        Thread.sleep(2000);
        sel.selectByValue("26");

        Thread.sleep(2000);
        sel.selectByIndex(0);
    }
}
