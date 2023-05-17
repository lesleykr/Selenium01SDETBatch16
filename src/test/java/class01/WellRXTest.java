package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WellRXTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wellrx.com");
        driver.findElement(By.id("drugSearchInput")).sendKeys("TAMSULOSIN HCL");
        driver.findElement(By.id("addressSearchBanner")).sendKeys("47274");
        driver.findElement(By.id("btnSearchInternal")).click();
    }
}
