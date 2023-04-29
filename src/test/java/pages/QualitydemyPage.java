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

  @FindBy(xpath = "//*[text()='3']")
  public WebElement saylamaLinki;

  @FindBy(xpath = "(//img[@class='img-fluid'])[7]")
  public WebElement course;

  @FindBy(xpath = "//button[@class='btn btn-buy']")
  public WebElement buyNow;

  @FindBy(xpath = "//button[@class='btn red w-100 radius-10 mb-3']")
  public WebElement checKout;

  @FindBy(xpath = "//div[@class='col-12']")
  public WebElement stripe;

  @FindBy(xpath = "//button[@class='stripe-button payment-button float-end']")
  public WebElement stripeButton;

  @FindBy(xpath = "(//input[@class='CheckoutInput Input Input--empty'])[1]")
  public WebElement krediKartıEmail;

  @FindBy(xpath = "(//input[@class='CheckoutInput CheckoutInput--tabularnums Input Input--empty'])[1]")
  public WebElement krediKartNumarası;

  @FindBy(xpath = "(//input[@class='CheckoutInput CheckoutInput--tabularnums Input Input--empty'])[2]")
  public WebElement cvc;

  @FindBy(xpath = "(//input[@type='text'])[3]")
  public WebElement sonKullanmaTarihi;

  @FindBy(xpath = "(//input[@type='text'])[5]")
  public WebElement kartİsim;

  @FindBy(xpath = "//input[@id='enableStripePass']")
  public WebElement tick;

  @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
  public WebElement ode;






}
