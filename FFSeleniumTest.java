import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFSeleniumTest {
    public static void main(String[] args) {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        // Navigate to a website
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        //Entering text into the textbox
                username.sendKeys("visual_user");
                password.sendKeys("secret_sauce");


        // Simulate pressing the "login" button
            loginButton.click();


      //  driver.quit();
    }
    }
