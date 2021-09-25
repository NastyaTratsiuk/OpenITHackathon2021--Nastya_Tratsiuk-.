package stepdefs;

import io.cucumber.java.en.Then;
import services.SuccesService;

import static org.junit.Assert.assertTrue;

public class Stepdefs {

    public SuccesService succesService;

    Stepdefs(SuccesService succesService){
        this.succesService = succesService;
    }

    @Then("success page is open: choose English.")
    public void successPageIsOpenSuccessfulRegistrationPage() {
        assertTrue(succesService.isPageShown());
    }
}
