package components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class PageObject {
    SelenideElement inputForSearch = $("input.input.is-medium[placeholder='Поиск']");
    ElementsCollection collectionDropDownWithResultOfSearch = $$(".dropdown-item");

    public void openPage(String link) {
        open(link);
    }

    public void openMainPageAndSetValueForSearch(String searchValueTitle) {
        openPage("/");
        inputForSearch.setValue(searchValueTitle);
        collectionDropDownWithResultOfSearch.get(0).click();
    }
}
