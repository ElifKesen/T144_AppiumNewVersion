package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TeknosaPage {
    public TeknosaPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }

    @FindBy(xpath = "//*[@text='Atla']")
    public WebElement atlaButonu;

    @FindBy(xpath = "//*[@text='Kategoriler']")
    public WebElement KategorilerButonu;

    @FindBy(xpath = "//*[@text='Filtrele']")
    public WebElement filtereButonu;

    @FindBy(xpath = "//*[@text='Marka']")
    public WebElement markaButonu;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement markaMetinKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[25]")
    public WebElement filtrelenmismarkakutucugu;

    @FindBy(xpath = "//*[@text='Sonuçları Göster']")
    public WebElement sonculariGoster;

    @FindBy(xpath = "//*[@text='Sırala']")
    public WebElement siralaButton;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[8]")
    public WebElement enUcuzFiyat;
    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[10]")
    public WebElement enPahaliFiyat;




}
