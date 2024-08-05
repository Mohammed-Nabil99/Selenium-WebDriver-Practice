import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Interactions_with_browser {
    public static void main(String[] args) {
        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
        WebElement box=Driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
        Actions action=new Actions(Driver);
        action.contextClick(box).perform();
        System.out.println(Driver.switchTo().alert().getText());



    }
    public static void login(){

        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement user= Driver.findElement(By.name("username"));
        user.sendKeys("tomsmith");
        WebElement pass= Driver.findElement(By.name("password"));
        pass.sendKeys("SuperSecretPassword!");
        WebElement login=Driver.findElement(By.className("radius"));
        login.click();
    }
    public static void displayed_test(){
        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebElement displayed= Driver.findElement(By.xpath("//input[@id=\"et_pb_contact_name_0\"]"));
        boolean status= displayed.isDisplayed();
        System.out.println(status);
    }
    public static void dropdown(){
        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown= Driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        dropdown.click();
        Select select=new Select(dropdown);
        select.selectByIndex(1);
    }
    public static void R_click_on_element(){
        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
        WebElement box=Driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
        Actions action=new Actions(Driver);
        action.contextClick(box).perform();
    }
    public static void double_click_on_element(){
        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://cookbook.seleniumacademy.com/DoubleClickDemo.html");
        WebElement box=Driver.findElement(By.xpath("//p[@id=\"message\"]"));
        Actions action=new Actions(Driver);
        action.doubleClick(box).perform();
    }
    public static void trigger_an_element(){
        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebElement trigger= Driver.findElement(By.xpath("//a[text()=\"Click Me\"]\n"));
        Actions action=new Actions(Driver);
        action.moveToElement(trigger).perform();
    }
    public static void checklist_click(){WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        WebElement checklist= Driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        checklist.click();
    }
    public static void isselected(){WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        WebElement checklist= Driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
        System.out.println(checklist.isSelected());}
    public static void get(){WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebElement button= Driver.findElement(By.xpath("//a[text()=\"Go to login page\"]"));
        System.out.println(button.getTagName());
        System.out.println(button.getSize());
        System.out.println(button.getAriaRole());}
    public static void DragandDrop(){WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://cookbook.seleniumacademy.com/DragDropDemo.html");
        WebElement source= Driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement des= Driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        Actions action = new Actions(Driver);
        action.dragAndDrop(source,des).perform();
        //        action.clickAndHold(source).moveToElement(des).release().build().perform();
                }
    public static void window_handling(){
        WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/windows");
        String main = Driver.getWindowHandle();
        Driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();
        Set<String> windows=Driver.getWindowHandles();
        for(String s : windows)
        {
            if(s.equals(main));
            Driver.switchTo().window(s);
        }
        System.out.println(Driver.findElement(By.tagName("h3")).getText());
        Driver.switchTo().window(main);
        System.out.println(Driver.findElement(By.tagName("h3")).getText());
    }
    public static void frame_single(){
        WebDriver Driver = new ChromeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement frame=   Driver.findElement(By.xpath("//iframe [@id=\"mce_0_ifr\"]"));
        Driver.switchTo().frame(frame);
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Driver.findElement(By.xpath("//body[@id=\"tinymce\"]")).sendKeys("Hello,Ahmed");}
    public static void frame_nested(){    WebDriver Driver = new ChromeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement top_frame= Driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
        Driver.switchTo().frame(top_frame);
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement mid_frame= Driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
        Driver.switchTo().frame(mid_frame);
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String m=Driver.findElement(By.id("content")).getText();
        System.out.println(m);}
    public static void waiting(){WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://cookbook.seleniumacademy.com/DragDropDemo.html");
        WebElement source= Driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement des= Driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Actions action = new Actions(Driver);
        action.dragAndDrop(source,des).perform();
        new WebDriverWait(Driver,Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(source));}
    public static void alert(){WebDriver Driver = new EdgeDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
        WebElement box=Driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
        Actions action=new Actions(Driver);
        action.contextClick(box).perform();
        System.out.println(Driver.switchTo().alert().getText());}
}


