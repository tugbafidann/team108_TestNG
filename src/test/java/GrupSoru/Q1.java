package GrupSoru;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Q1 {
    //● https://the-internet.herokuapp.com/dropdown adresine gidin.
    //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //4.Tüm dropdown değerleri(value) yazdırın
    //5. Dropdown'un boyutunu bulun, Dropdown'da 4 öğe varsa konsolda True , degilse
    //False yazdırın
    HerokuappPage herokuappPage=new HerokuappPage();
    @Test
    public void test01(){
        //● https://the-internet.herokuapp.com/dropdown adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("herokuappDdmUrl"));
        //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın

        Select select=new Select(herokuappPage.ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle(3);
        //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        //4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement> options=select.getOptions();
        int elementNo=0;
        for (WebElement each:options
             ) {
            System.out.println(elementNo+"-"+each.getText());
            elementNo++;
        }
        //5. Dropdown'un boyutunu bulun, Dropdown'da 4 öğe bulundugunu test edin ve true false
        // olarak raporlayın
        int actualDdmSize=options.size();
        int expectedDdmSize=4;
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualDdmSize,expectedDdmSize,"False");
        softAssert.assertNotEquals(actualDdmSize,expectedDdmSize,"True");
        softAssert.assertAll();
        Driver.closeDriver();
    }

}
