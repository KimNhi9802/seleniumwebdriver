/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ADMIN
 */
public class Seleniumdemo {
    WebDriver driver;
    
    public void launche(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }
    public void login(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("1");
        
        driver.findElement(By.id("login-button")).click();
    }
    
    public void navigate(){
        driver.navigate().to("https://www.simplilearn.com/");
        System.out.print("Title page is: " + driver.getTitle());
    }
    
    public void close(){
        driver.quit();
    }
    
    public void verify(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3"));
        String aText = element.getText();
        String eText = "Epic sadface: Username and password do not match any user in this service";
        
        if(aText.equals(eText)){
            System.out.print("Verified Text");
        }
        else{
            System.out.print("Not Verified Text");
        }
    }
    public static void main(String[] args) {
        Seleniumdemo obj = new Seleniumdemo();
        
        obj.launche();
        
        obj.login();
        
        //obj.navigate();
        
        obj.verify();
        
        obj.close();
    }
    
}
