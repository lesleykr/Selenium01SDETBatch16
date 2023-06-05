package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods{
    public static void main(String[] args) throws InterruptedException {
        String url="https://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement helpBtn=driver.findElement(By.linkText("Help"));
        helpBtn.click();
        Thread.sleep(1000);

        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        String mainPageHandle=driver.getWindowHandle();
        System.out.println(mainPageHandle);
//get all the window handles and print the titles associated with each window
        //handle

        //get all handles
        //switch the focus of the driver to google help pg
        Set <String> allHandles=driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }
           // System.out.println(handle+" "+title);
            //when the focus is shifted to correct page

        }
        System.out.println("the current page under focus is: "+driver.getTitle());
//switch focus back to main page
        driver.switchTo().window(mainPageHandle);
        //check the focus
        System.out.println("The focus is on: "+driver.getTitle());
        //get all handles
    }
}
