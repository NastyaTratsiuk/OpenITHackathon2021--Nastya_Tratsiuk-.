package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import services.MainServices;

public class MainStepdefsPage {

    public MainServices mainServices;

    MainStepdefsPage(MainServices mainServices){
        this.mainServices = mainServices;
    };

    @Given("button language: button \"Language\".")
    public void joinPageIsOpen() {
        mainServices.openLanguage();
    }

    @When("flight page is open:  button \"Language English\" .")
    public void homePageIsOpenTravelButton(String arg0) {
       mainServices.chooseLanguage();
    }


}
