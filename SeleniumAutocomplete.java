import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumAutocomplete {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        // Navigate to a website
        driver.get("https://google.com/");

        WebElement autoComplete = driver.findElement(By.id("APjFqb"));
        autoComplete.sendKeys("monster hunter wilds");
        Thread.sleep(1000);

        WebElement autoCompleteResult = driver.findElement(By.className("sbct"));
       autoCompleteResult.click();


      //  driver.quit();



    }
}
