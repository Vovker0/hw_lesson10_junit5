package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.PopupBanner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    PopupBanner popupBanner = new PopupBanner();

    SelenideElement resultsHeading = $("[data-test=resultsHeading]"),
            footerHeader = $("#footerHeader"),
            resultsGrid = $("[data-test='product-grid']");

    public SearchResultPage removePopupBanner() {
        popupBanner.removeBanner();
        return this;
    }

    public SearchResultPage scrollPageToLoadMostResults() {
        footerHeader.scrollIntoView("{behavior: 'smooth'}");
        return this;
    }

    public SearchResultPage checkIfFoundAny(String value) {
        resultsHeading.shouldHave(text(" results for “" + value + "”"));
        return this;
    }

    public SearchResultPage checkResultsFor(String value) {
        resultsGrid.shouldHave(text(value));
        return this;
    }
}
