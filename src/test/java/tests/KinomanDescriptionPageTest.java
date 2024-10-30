package tests;

import components.PageObject;
import components.ResultList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("positive-simple")
public class KinomanDescriptionPageTest extends TestBase {
    PageObject pageObject = new PageObject();
    ResultList resultList = new ResultList();
    String searchValueTitle = "Головоломка 2",
            searchValueYear = "2024",
            searchCountry = "США",
            searchAuthor = "Келси Манн",
            moviePath = "/movie/26197";
    @DisplayName("Test check the names of attributes on detail page ")
    @Test
    void checkCountOfContentAttributesOnDetailPageTest() {
        step( "Open main page and set title in search field: ", () -> {
            pageObject.openMainPageAndSetValueForSearch(searchValueTitle);
        });
        step( "Check result of test: ", () -> {
            resultList.ShouldHaveContentAttributesCount(searchValueTitle);
        });
    }
    @DisplayName("Test check the title in content attributes on detail page ")
    @Test
    void checkTitleInContentAttributesOnDetailPageTest() {
        step( "Open main page and set title in search field: ", () -> {
            pageObject.openMainPageAndSetValueForSearch(searchValueTitle);
        });
        step( "Check result of test: ", () -> {
            resultList.ShouldHaveTitleInContentAttributes(searchValueTitle);
        });
    }
    @DisplayName("Test check the year in content attributes on detail page ")
    @Test
    void checkYearInContentAttributesOnDetailPageTest() {
        step( "Open main page and set title in search field: ", () -> {
            pageObject.openMainPageAndSetValueForSearch(searchValueTitle);
        });
        step( "Check result of test: ", () -> {
            resultList.ShouldHaveYearInContentAttributes(searchValueYear);
        });
    }
    @DisplayName("Test check the country in content attributes on detail page ")
    @Test
    void checkCountryInContentAttributesOnDetailPageTest() {
        step( "Open main page and set title in search field: ", () -> {
            pageObject.openMainPageAndSetValueForSearch(searchValueTitle);
        });
        step( "Check result of test: ", () -> {
            resultList.ShouldHaveCountryInContentAttributes(searchCountry);
        });
    }
    @DisplayName("Test check the author in content attributes on detail page ")
    @Test
    void checkAuthorInContentAttributesOnDetailPageTest() {
        step( "Open main page and set title in search field: ", () -> {
            pageObject.openMainPageAndSetValueForSearch(searchValueTitle);
        });
        step( "Check result of test: ", () -> {
            resultList.ShouldHaveAuthorInContentAttributes(searchAuthor);
        });
    }
    @DisplayName("Test check the description in content attributes on detail page from .csv local file")
    @Test
    void checkDescriptionOfSearchingValueTest() {
        step( "Open file .csv to get description of film: ", () -> {
            pageObject.openPage(moviePath);
        });
        step( "Compare values of description: ", () -> {
            try {
                resultList.checkFullOfDescription(searchValueTitle);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
