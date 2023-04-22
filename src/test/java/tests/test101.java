package tests;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class test101 {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Test

    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        qualitydemyPage.cookies.click();

    }
}
