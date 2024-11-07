package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;

public class apkyuklemeStep {
    @Given("Kullanici uygulamayi yukler")
    public void kullanici_uygulamayi_yukler() {
        Driver.getAndroidDriver();
    }

}
