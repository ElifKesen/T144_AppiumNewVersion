package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.TeknosaPage;
import utils.Driver;

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

    }
    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_bolumune_tiklanir(String string) {

    }
    @Given("acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String string) {

    }
    @Given("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {

    }
    @Given("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String string) {

    }
    @Given("siralama yapilirak {string} secilir")
    public void siralama_yapilirak_secilir(String string) {

    }
    @Given("fiyatlarin artan duzende oldugu test edilir")
    public void fiyatlarin_artan_duzende_oldugu_test_edilir() {

    }
}
