package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TeknosaPage;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class TeknosaStep {
    TeknosaPage page=new TeknosaPage();

    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
        Driver.getAndroidDriver();
    }
    @Given("Ilk ekran bolumunden atlaya tiklanir")
    public void ilk_ekran_bolumunden_atlaya_tiklanir() {
        page.atlaButonu.click();

    }
    @Given("footer bolumunden {string} bolumune tiklanir")
    public void footer_bolumunden_bolumune_tiklanir(String string) {
        page.KategorilerButonu.click();

    }
    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_bolumune_tiklanir(String kategorisec) throws InterruptedException {
        Thread.sleep(4000);
        ReusableMethods.scrollWithUiScrollableAndClick(kategorisec);


    }
    @Given("acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String urunsec) {
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(urunsec);

    }
    @Given("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
        ReusableMethods.bekle(3);
        page.filtereButonu.click();

    }
    @Given("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String marka) {
        ReusableMethods.bekle(3);
        page.markaButonu.click();
        ReusableMethods.bekle(3);
        page.markaMetinKutusu.sendKeys(marka);
        ReusableMethods.bekle(3);
        page.filtrelenmismarkakutucugu.click();
        ReusableMethods.bekle(3);
        page.sonculariGoster.click();


    }
    @Given("siralama yapilirak {string} secilir")
    public void siralama_yapilirak_secilir(String siralamasecimi) {
        ReusableMethods.bekle(3);
        page.siralaButton.click();
        ReusableMethods.scrollWithUiScrollableAndClick(siralamasecimi);


    }
    @Given("fiyatlarin artan duzende oldugu test edilir")
    public void fiyatlarin_artan_duzende_oldugu_test_edilir() {
        ReusableMethods.bekle(5);
        String enucuzFiyat=page.enUcuzFiyat.getText();
        enucuzFiyat = enucuzFiyat.replaceAll("\\D", "");
        System.out.println(enucuzFiyat);

        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,100);

        String enpahaliFiyat=page.enPahaliFiyat.getText();
        enpahaliFiyat = enpahaliFiyat.replaceAll("\\D", "");
        System.out.println(enpahaliFiyat);

        Assert.assertTrue(Integer.parseInt(enpahaliFiyat)>Integer.parseInt(enucuzFiyat));
    }

    @Given("kategoriler bolumunden kaydirarak {string} bolumune tiklanir")
    public void kategoriler_bolumunden_kaydirarak_telefon_bolumune_tiklanir(String kategoriSecim) {
        ReusableMethods.bekle(5);
        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(), 0.60, 0.40, 0.50, 200);
        ReusableMethods.bekle(7);
        ReusableMethods.scrollWithUiScrollableAndClick(kategoriSecim);

    }
    @Given("kullanici ekran fotografi cekmek istedigi elementin {string} ekran fotografini ceker")
    public void kullanici_ekran_fotografi_cekmek_istedigi_elementin_ekran_fotografini_ceker(String ekranfototexti) throws IOException {
        ReusableMethods.bekle(2);
        ReusableMethods.screenShotElement(ekranfototexti);

    }

    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() {
        ReusableMethods.bekle(6);
        String enPahaliFiyat=page.azalanenPahaliFiyat.getText();
        enPahaliFiyat=enPahaliFiyat.replaceAll("\\D","");
        System.out.println(enPahaliFiyat);
        //ReusableMethods.ekranKaydirmaMethodu(511,2037,750,511,639);
        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,100);
        String enUcuzFiyat=page.azalanenUcuzFiyat.getText();
        enUcuzFiyat=enUcuzFiyat.replaceAll("\\D","");
        System.out.println(enUcuzFiyat);
        Assert.assertTrue(Integer.parseInt(enPahaliFiyat)>Integer.parseInt(enUcuzFiyat));
    }



    }









