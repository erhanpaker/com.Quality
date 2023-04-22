package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

  public QualitydemyPage(){

    PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(xpath = "//*[text()='Accept']")
  public WebElement cookies;

  @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
  public WebElement loginLinki;

  @FindBy(xpath = "//input[@type='email']")
  public WebElement emailKutusu;

  @FindBy(xpath = "//input[@type='password']")
  public WebElement passwordKutusu;

  @FindBy(xpath = "(//button[@type='submit'])[2]")
  public WebElement loginButonu;

  @FindBy(xpath = "//span[@class='fw-500']")
  public WebElement categories;

  @FindBy(xpath = "//i[@class='fa fa-align-justify']")
  public WebElement allCourses;





}
