package guru.qa.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.PopupBanner;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AllCategoriesPage {

    PopupBanner popupBanner = new PopupBanner();

    SelenideElement pageTitle = $("[data-test='page-title']"),
            pageContent = $("[data-test='@web/SlotRenderer']");
    ElementsCollection subCategoriesCollection = $$("[data-test='@web/SlingshotComponents/Browse']");

    public AllCategoriesPage openPage() {
        open("/c/shop-all-categories/-/N-5xsxf?tag=ShopAll_CN");
        pageTitle.shouldHave(text("Shop All Categories"));
        return this;
    }

    public AllCategoriesPage removePopupBanner() {
        popupBanner.removeBanner();
        return this;
    }

    public AllCategoriesPage scrollToRight(String category) {

        SelenideElement rightScrollButton = $(byText(category))
                .ancestor("div").sibling(0).$("[aria-label='next page']");

        while (rightScrollButton.isDisplayed()) {
            rightScrollButton.click();
            sleep(400);
        }
        return this;
    }

    public AllCategoriesPage checkMainCategory(String value) {
        pageContent.shouldHave(text(value));
        return this;
    }

    public void checkSubCategoriesOnThePage(int index, String expectedCategory, List<String> expectedSubCategories) {
        String mainAndSubCategoriesFromThePage = subCategoriesCollection.texts().get(index)
                .replaceAll("\n", ", ");
        String mainAndSubCategoriesFromTestDataAsString = expectedCategory + ", " + expectedSubCategories
                .toString().substring(1, (expectedSubCategories.toString().length() - 1));
        Assertions.assertEquals(mainAndSubCategoriesFromTestDataAsString, mainAndSubCategoriesFromThePage);
    }
}
