package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SoftAssert {
      /*
            Genel olarak
                - test edin denirse hard assert
                - dogrulayin(verify) denirse soft assert kasdedilir
         */

    // amazon anasayfaya gidip, dogru sayfaya gittigimizi DOGRULAYIN (verify)
    // Nutella icin arama yapip, sonuclarin Nutella icerdigini dogrulayin
    // ilk urune tiklayip, urun isminde Nutella gectigini dogrulayin
    @Test
    public void amazonTesti(){
        // amazon anasayfaya gidip, dogru sayfaya gittigimizi DOGRULAYIN (verify)
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedUrl="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedUrl),"url amazon icermiyor");
        // Nutella icin arama yapip, sonuclarin Nutella icerdigini dogrulayin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        String expectedIcerik="Nutella";
        String actualAramaSonucYazisi=amazonPage.aramaSonucElementi.getText();
        softAssert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik),
                               "arama sonuc yazisi nutella icermiyor");
        // ilk urune tiklayip, urun isminde Nutella gectigini dogrulayin
        amazonPage.ilkUrun.click();
        expectedIcerik="Nutella";
        String actualIlkUrunYazisi=amazonPage.ilkUrunIsimElementi.getText();
        softAssert.assertTrue(actualIlkUrunYazisi.contains(expectedIcerik),
                              "ilk ürün nutella isimini icermiyor");
        softAssert.assertAll();
        Driver.closeDriver();


    }
}
