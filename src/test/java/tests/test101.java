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
        ReusableMethods.bekle(5);
        qualitydemyPage.stripe.click();
        ReusableMethods.bekle(2);
        qualitydemyPage.stripeButton.click();
        qualitydemyPage.krediKartıEmail.sendKeys(ConfigReader.getProperty("GecerliMail"));
        actions.sendKeys(Keys.TAB).perform();
        qualitydemyPage.krediKartNumarası.sendKeys("4242424242424242");
        actions.sendKeys(Keys.TAB).perform();
        qualitydemyPage.cvc.sendKeys("334");
        actions.sendKeys(Keys.TAB).perform();
        qualitydemyPage.sonKullanmaTarihi.sendKeys("1124");
        actions.sendKeys(Keys.TAB).perform();
        qualitydemyPage.kartİsim.sendKeys("erhan");
        actions.sendKeys(Keys.TAB).perform();
        qualitydemyPage.ode.click();
    }

    @Test
    public void test1002(){

        qualitydemyPage.loginMetodu();



    }
}
