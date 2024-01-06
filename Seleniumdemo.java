
package seleniumdemo;

//đầu tiên 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemo {
    //tạo biến toàn cục
    WebDriver driver;
    //đầu tiên em sẽ mở trình duyệt và vào webssite
    public void launchbrowser(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1");
    }
    
    public void login(){
        //để nhập được tên và mật khẩu 
        //locators by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // ấn vào nút login
        driver.findElement(By.id("login-button")).click();
    }
    
    public void navigate(){
        driver.navigate().to("https://www.simplilearn.com/");
        System.out.print("Title is: " + driver.getTitle());
        driver.navigate().back();
    }
    
    public void close(){
        driver.quit();
    }
    public static void main(String[] args) {
        //để chạy đc em tạo 1 obj
        Seleniumdemo obj = new Seleniumdemo();
        obj.launchbrowser();
        obj.login();
        obj.navigate();
        
        obj.close();
    }
    
}
