package tests.day12_xmlFiles;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C_ReusableMethodsSwitchgwindows {
    //  Tests package’inda yeni bir class olusturun: WindowHandle2
    //  https://the-internet.herokuapp.com/windows adresine gidin.
    //  Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //  Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    //  Click Here butonuna basın.
    //  Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
    //dogrulayin.
    //  Sayfadaki textin “New Window” olduğunu doğrulayın.
    //  Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
    //olduğunu doğrulayın.
    @Test
    public void switchinWindowsTesti(){
        //  Tests package’inda yeni bir class olusturun: WindowHandle2

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
        //dogrulayin.
        ReusableMethods.switchToWindow("New Window");
        System.out.println(Driver.getDriver().getTitle());
        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
        //olduğunu doğrulayın.
        Driver.quitDriver();
    }
}
