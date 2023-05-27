package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.attribute.UserPrincipalLookupService;

public class MultiDD extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php\n";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement DD=driver.findElement(By.xpath("//select[@name='States']"));

        Select sel=new Select(DD);
        boolean isMul=sel.isMultiple();
        System.out.println("the drop down is multi select: "+isMul);

        sel.selectByVisibleText("California");
        sel.selectByValue("Ohio");
        sel.selectByIndex(7);

        sel.deselectByVisibleText("Ohio");

    }
}
