package pages;

import elements.Button;
import org.openqa.selenium.By;

//Находим элементы главной страницы
public class PageMain {

    private final Button changeLanguageBtn = new Button(By.className("location-selector__button"));
    private final Button changeLanguageEnglishBtn = new Button(By.className("location-selector__link active"));

    public Button getChangeLanguageBtn() {
        return changeLanguageBtn;
    }

    public Button getChangeLanguageEnglishBtn() {
        return changeLanguageEnglishBtn;
    }
}