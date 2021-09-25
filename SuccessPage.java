package pages;

import elements.Button;
import elements.Label;
import org.openqa.selenium.By;

public class SuccessPage {

    private final Label changeLanguageLabel = new Label(By.className("location-selector__button"));

    public Label getChangeLanguageLabel() {
        return changeLanguageLabel;
    }
}
