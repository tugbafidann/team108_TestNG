package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    /*
     * Navigate to https://www.saucedemo.com/
     * Enter the username as standard_user
     * Enter the password as secret_sauce
     * Click on login button
     *    Test1 : Choose price low to high
     *    Test2 : Verify item prices are sorted from low to high with soft Assert
     */
    SoftAssert softAssert=new SoftAssert();
    @Test
    public void saucedemoTest1(){
        //  * Navigate to https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));
        //     * Enter the username as standard_user
        Driver.getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
        //     * Enter the password as secret_sauce
        Driver.getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
        //     * Click on login button
        Driver.getDriver().findElement(By.id("login-button")).click();
        //     *    Test1 : Choose price low to high
        WebElement ddm=Driver.getDriver().findElement(By.className("product_sort_container"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Price (low to high)");
        String expected="Price (low to high)";
        String actual=Driver.getDriver().findElement(By.className("active_option")).getText();
        System.out.println(actual);


        softAssert.assertEquals(actual,expected,
                "Aktif secenekteki yazi expected datadakinden farkli");
        softAssert.assertAll();
        //     *    Test2 : Verify item prices are sorted from low to high with soft Assert

    }
    @Test
    public void saucdemoTest2(){
        String expected="Price (low to high)";
       List<WebElement> fiyatlar=Driver.getDriver().findElements(By.className("inventory_item_price"));
       ArrayList<Double> fiyatlarDouble=new ArrayList<>();
       for (WebElement fiyat: fiyatlar){
           //String fiyatStr=fiyat.getText()
       }
    }
}
