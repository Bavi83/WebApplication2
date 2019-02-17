import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        System.setProperty ("webdriver.chrome.driver", "C:\\SW\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj = new ChromeDriver ();
        obj.get ("http://www.way2automation.com/angularjs-protractor/webtables/");
        obj.manage ().window ().maximize ();

        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).sendKeys ("FName1");
        obj.manage ().timeouts ().implicitlyWait (10000000, TimeUnit.MINUTES);

        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).clear ();


        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).sendKeys ("FName2");

        obj.manage ().timeouts ().implicitlyWait (100000000, TimeUnit.MINUTES);

        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).clear ();

        obj.manage ().timeouts ().implicitlyWait (100000000, TimeUnit.MINUTES);


        obj.findElement (By.cssSelector ("td:nth-child(1) > .btn")).click ();

        obj.findElement (By.name ("FirstName")).sendKeys ("FName1");
        obj.findElement (By.name ("LastName")).sendKeys ("LName1");
        obj.findElement (By.name ("UserName")).sendKeys ("User1");
        obj.findElement (By.name ("Password")).sendKeys ("Pass1");
        obj.findElement (By.cssSelector (".radio:nth-child(1)")).click ();
        obj.findElement (By.name ("RoleId")).sendKeys ("Admin");
        obj.findElement (By.name ("Email")).sendKeys ("admin@mail.com");
        obj.findElement (By.name ("Mobilephone")).sendKeys ("082555");

        obj.findElement (By.cssSelector (".btn-success")).click ();

        obj.findElement (By.cssSelector ("td:nth-child(1) > .btn")).click ();

        obj.findElement (By.name ("FirstName")).clear ();

        obj.findElement (By.name ("FirstName")).sendKeys ("FName2");
        obj.findElement (By.name ("LastName")).clear ();
        obj.findElement (By.name ("LastName")).sendKeys ("LName2");
        obj.findElement (By.name ("UserName")).clear ();
        obj.findElement (By.name ("UserName")).sendKeys ("User2");
        obj.findElement (By.name ("Password")).clear ();
        obj.findElement (By.name ("Password")).sendKeys ("Pass2");
        obj.findElement (By.cssSelector (".radio:nth-child(2)")).click ();

        obj.findElement (By.name ("RoleId")).sendKeys ("Customer");
        obj.findElement (By.name ("Email")).clear ();
        obj.findElement (By.name ("Email")).sendKeys ("customer@mail.com");
        obj.findElement (By.name ("Mobilephone")).clear ();
        obj.findElement (By.name ("Mobilephone")).sendKeys ("083444");

        obj.findElement (By.cssSelector (".btn-success")).click ();

        obj.manage ().timeouts ().implicitlyWait (90000000, TimeUnit.MINUTES);

        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).sendKeys ("FName1");
        obj.manage ().timeouts ().implicitlyWait (90000000, TimeUnit.MINUTES);
        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).clear ();

        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).sendKeys ("FName2");

        obj.manage ().timeouts ().implicitlyWait (90000000, TimeUnit.MINUTES);

        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).clear ();

        obj.findElement (By.cssSelector (".smart-table-global-search > .pull-right")).sendKeys ("FName");











    }
}

