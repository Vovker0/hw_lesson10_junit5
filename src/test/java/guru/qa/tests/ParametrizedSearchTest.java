package guru.qa.tests;

import guru.qa.pages.AllCategoriesPage;
import guru.qa.pages.MainPage;
import guru.qa.pages.SearchResultPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class ParametrizedSearchTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    AllCategoriesPage allCategoriesPage = new AllCategoriesPage();

    @BeforeEach
    void beforeEach() {
        mainPage.openPage();
    }

    @ParameterizedTest(name = "В результатах поиска на сайте Target присутствует продукция, удовлетворяющая запросу {0}")
    @Tag("Critical")
    @ValueSource(strings = {"Coca-cola", "Snickers"})
    void successfulProductSearchTest(String product) {
        mainPage.searchFor(product);
        searchResultPage.checkIfFoundAny(product);
    }

    @ParameterizedTest(name = "В результатах первой страницы поиска сайта Target среди продукции {0} присутствует продукт: {1}")
    @Tag("Critical")
    @CsvFileSource(resources = "/ProductSearchTest.csv", delimiterString = "|")
    void successfulParticularProductSearchTest(String product, String productDetails) {
        mainPage.searchFor(product);
        searchResultPage.checkIfFoundAny(product)
                .scrollPageToLoadMostResults()
                .removePopupBanner()
                .checkResultsFor(productDetails);
    }

    @ParameterizedTest(name = "На странице 'Shop All Categories' на сайте Target присутствует категория продукции" +
            " {1} с соответствующим списком подкатегорий {2}")
    @Tag("Major")
    @MethodSource("guru.qa.tests.TestData#categoriesAndSubcategoriesTest")
    void categoriesAndSubcategoriesTest(int dataIndex, String forCategory, List<String> subCategories) {
        allCategoriesPage.openPage()
                .removePopupBanner()
                .checkMainCategory(forCategory)
                .scrollToRight(forCategory)
                .checkSubCategoriesOnThePage(dataIndex, forCategory, subCategories);
    }
}
