import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollTest {
    public static void main(String[] args) {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");

        //Initialize FireFox WebDriver
        WebDriver driver = new FirefoxDriver();

        //Navigate to the website
        driver.get("https://www.gutenberg.org/cache/epub/11/pg11-images.html");


    }
}
