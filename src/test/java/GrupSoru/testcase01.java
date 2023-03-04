package GrupSoru;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class testcase01 {
    // 1. Tarayıcıyı başlatın
    //2. 'http://automationexercise.com' URL'sine gidin
    //3. Ana sayfanın başarıyla göründüğünü doğrulayın
    //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
    //5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
    //6. Adı ve e-posta adresini girin
    //7. 'Kaydol' düğmesini tıklayın
    //8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
    //9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
    //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
    //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
    //12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
    //13. 'Hesap Oluştur düğmesini' tıklayın
    //14. 'HESAP OLUŞTURULDU!' görünür
    //15. 'Devam Et' düğmesini tıklayın
    //16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
    //17. 'Hesabı Sil' düğmesini tıklayın
    //18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın
    @Test
    public void automationTest01(){
        // 1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' URL'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        String expected="";
        String actual=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actual.contains(expected));
        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        AutomationPage automationPage=new AutomationPage();
        automationPage.signupLoginButonu.click();
        //5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
        softAssert.assertTrue(automationPage.SingupMessage.isDisplayed());
        //6. Adı ve e-posta adresini girin
        automationPage.SignupName.sendKeys("Tugba");
        automationPage.SignupEmail.sendKeys("t63sf@hotmail.com");
        //7. 'Kaydol' düğmesini tıklayın
        automationPage.SignupButtonu.click();
        //8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
        softAssert.assertTrue(automationPage.hesapBilgileri.isDisplayed());
        //9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
        automationPage.MrsTitle.click();
        automationPage.password.sendKeys("12345");
        Select select=new Select(automationPage.dayDdm);
        automationPage.dayDdm.click();
        select.selectByValue("23");
        select=new Select(automationPage.monthDdm);
        automationPage.monthDdm.click();
        select.selectByVisibleText("November");
        select=new Select(automationPage.yearDdm);
        automationPage.yearDdm.click();
        select.selectByVisibleText("1991");
        //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
       automationPage.bultenKayitOnayKutusu.click();
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        automationPage.ozelTeklifOnayKutusu.click();
        //12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        //13. 'Hesap Oluştur düğmesini' tıklayın
        //14. 'HESAP OLUŞTURULDU!' görünür
        //15. 'Devam Et' düğmesini tıklayın
        //16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        //17. 'Hesabı Sil' düğmesini tıklayın
        //18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın
    }
}
