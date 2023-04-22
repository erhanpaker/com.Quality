package tests;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class test101 {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Test

    // proje kodlarım ve anasayafa içerikleri

    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("GecerliMail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("GecerliPassword"));
        qualitydemyPage.loginButonu.click();
        qualitydemyPage.categories.click();
        qualitydemyPage.allCourses.click();

    }
}
