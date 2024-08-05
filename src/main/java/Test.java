import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
    public static void main(String[] args) {
//      First basic code
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.google.com");
//        driver.quit();

        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/");
        Driver.navigate().to("https://duckduckgo.com/");
        Driver.navigate().back();
        Driver.navigate().forward();
        Driver.navigate().back();
        Driver.manage().window().fullscreen();
       String url= Driver.getWindowHandle();
       System.out.println(url);
       Driver.quit();




    }
}
