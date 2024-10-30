package components;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultList {
    public void ShouldHaveContentAttributesCount(String searchValue) {
        $$(".description-field").shouldHave(size(7));
    }

    public void ShouldHaveTitleInContentAttributes(String searchValueTitle) {
        $("span[data-v-05ff1ab2]").shouldHave(text(searchValueTitle));
    }

    public void ShouldHaveYearInContentAttributes(String searchValueYear) {
        $$("span[data-v-05ff1ab2]").findBy(text(searchValueYear)).shouldBe(text(searchValueYear));
    }

    public void ShouldHaveCountryInContentAttributes(String searchValueCountry) {
        $$("span[data-v-05ff1ab2]").findBy(text(searchValueCountry)).shouldBe(text(searchValueCountry));
    }

    public void ShouldHaveAuthorInContentAttributes(String searchValueAuthor) {
        $$("span[data-v-05ff1ab2]").findBy(text(searchValueAuthor)).shouldBe(text(searchValueAuthor));
    }

    public void checkFullOfDescription(String searchValueTitle) throws Exception {
        OpenCvsFile openCvsFile = new OpenCvsFile();
        String filmDescription = openCvsFile.openCsvFileAndGetDescription(searchValueTitle);
        $$(".movie-description").get(1).shouldHave(text(filmDescription));
    }
}
