package homework.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxHRMForm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
        boolean message=driver.findElement(By.cssSelector("span[id='spanMessage']")).isDisplayed();
        System.out.println(message);
    }
}
