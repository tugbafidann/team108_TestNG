package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_configReaderKullanimi {
    @Test
    public void test01(){
        // amazon anasayfaya gidip
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        /* driver olusturduk. sonra amazonurl ihtiyac var bunun icin meydanci yani
            ConfigReader dan getProperty methoduna key yani amazonUrl getiriyoruz
            Bu şekilde kodumuz dinamik oldu.
         */
        // Test datasi olarak verilen kelime icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")
                          + Keys.ENTER);


        // arama sonuclarinin arattigimiz test datasini icedrigini test edelim
        String expectedIcerik=ConfigReader.getProperty("amazonAranacakKelime");
        String actualIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

    }
}
