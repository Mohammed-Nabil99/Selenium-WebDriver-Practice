import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElements {
    public static void main(String[] args) {
        WebDriver Driver = new EdgeDriver();
//      search by id
        Driver.navigate().to("https://duckduckgo.com/duckduckgogg42xjoc72x3sjasowoarfbgcmvfimaftt6twagswzczad.onion");
//        WebElement SearchBox = Driver.findElement(By.id("search_form_input_homepage"));
//        SearchBox.sendKeys("egypt");
//
//       WebElement Search= Driver.findElement(By.id("search_button_homepage"));
//         Search.click();

//        search by name

//        Driver.navigate().to("https://duckduckgo.com/duckduckgogg42xjoc72x3sjasowoarfbgcmvfimaftt6twagswzczad.onion");
//        WebElement SearchBox = Driver.findElement(By.name("q"));
//        SearchBox.sendKeys("egypt");
//
//       WebElement Search= Driver.findElement(By.id("search_button_homepage"));
//         Search.click();

//        searching by linktext
//        Driver.navigate().to("https://the-internet.herokuapp.com/");
//        WebElement Search = Driver.findElement(By.linkText("A/B Testing"));
//        Search.click();

//        searching by ClassName
//        Driver.navigate().to("https://the-internet.herokuapp.com/login");
//        WebElement user= Driver.findElement(By.name("username"));
//        user.sendKeys("tomsmith");
//        WebElement pass= Driver.findElement(By.name("password"));
//        pass.sendKeys("SuperSecretPassword!");
//
//        WebElement login=Driver.findElement(By.className("radius"));
//        login.click();

//          searching using xpath
        //absolute xpath
//        Driver.get("https://duckduckgo.com/?va=c&t=ho&q=Panda&ia=web");
//        WebElement image=Driver.findElement(By.xpath("//a[@data-zci-link='images']"));
//        image.click();
//
        //Relative xpath
//        Driver.get("https://duckduckgo.com/?va=c&t=ho&q=Panda&ia=web");
//        WebElement video=Driver.findElement(By.xpath("//*[@id=\"duckbar_static\"]/li[3]/a"));
//        video.click();

        // <input type="search"
//        Driver.get("https://duckduckgo.com/?va=c&t=ho&q=Panda&ia=web");
//        WebElement news=Driver.findElement(By.xpath("(//li[@class='zcm__item'])[4]"));
//        news.click();

        //using contains
//        Driver.get("https://duckduckgo.com/?va=c&t=ho&q=Panda&ia=web");
//        WebElement img=Driver.findElement(By.xpath("img[contains(@height,16)]"));
//        img.click();


        //using text
        Driver.get("https://duckduckgo.com/?va=c&t=ho&q=Panda&ia=web");
//        WebElement img=Driver.findElement(By.xpath("//*[text()="Panda"]"));
//        img.click();

            //searching using css

        //searching using id

//        Driver.get("https://start.duckduckgo.com/");
//        Driver.findElement(By.cssSelector("#searchbox_input")).sendKeys("panda");

        //searching using className

//        Driver.get("https://start.duckduckgo.com/");
//        Driver.findElement(By.cssSelector(".searchbox_input__bEGm3")).sendKeys("panda");

        //searching using compundClass

//        Driver.get("https://duckduckgo.com/?q=panda&t=h_&start=1&ia=web");
//        Driver.findElement(By.cssSelector("ul[class *=\"zcm__menu\"]")).click();

        //searching using children

//        Driver.get("https://duckduckgo.com/?q=panda&t=h_&start=1&ia=web");
//        Driver.findElement(By.cssSelector("li[class=\"zcm__item\"]>a[data-zci-link=\"images\"]")).click();

        //searching using nth-of-type (index)

//        Driver.get("https://duckduckgo.com/?q=panda&t=h_&start=1&ia=web");
//        Driver.findElement(By.cssSelector("li[class=\"zcm__item\"]:nth-child(5)")).click();
    }
}
