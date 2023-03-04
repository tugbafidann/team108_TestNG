package tests.day11_POM_assertions;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_NegatifLoginTesti {
    // qd anasayfaya gidin
    // 3 test methodu oluşturun ve aşagıdaki durumlarda girişş yapilamadigini test edin
     // 1- geçerli username,gecersiz password
    // 2- gecersiz username, gecerli password
    // 3- gecersiz username, gecersiz password
    QdPage qdPage=new QdPage();
    @Test
    public void negatifLogin1(){
        qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword")
                                       + Keys.ENTER);
        // qdPage.loginButonu.click();

        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
        Driver.closeDriver();

    }

    @Test
    public void negatifLogin2(){
        qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword")
                                +Keys.ENTER);
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
        Driver.closeDriver();
    }
    @Test
    public void negatifLogin3(){
        qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword")
                +Keys.ENTER);
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
        Driver.closeDriver();

    }


}
