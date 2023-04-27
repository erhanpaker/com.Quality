package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class test101 {

    Actions actions = new Actions(Driver.getDriver());
    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Test



    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("GecerliMail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("GecerliPassword"));
        qualitydemyPage.loginButonu.click();
        qualitydemyPage.categories.click();
        qualitydemyPage.allCourses.click();
        actions.sendKeys(Keys.PAGE_DOWN)
                        .sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        qualitydemyPage.saylamaLinki.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(3);
        qualitydemyPage.course.click();
        ReusableMethods.bekle(2);
        qualitydemyPage.buyNow.click();
        ReusableMethods.bekle(2);
        qualitydemyPage.checKout.click();

    }
}
