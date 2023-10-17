package guru.qa.tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class TestData {

    static Stream<Arguments> categoriesAndSubcategoriesTest() {
        return Stream.of(
                Arguments.of(0, "Clothing, Shoes & Accessories", List.of("Women’s", "Men’s", "Young Adult", "Kids’ & Baby", "Shoes", "Family Outfits")),
                Arguments.of(1, "Home & Patio", List.of("Home", "Outdoor Living & Garden", "Kitchen & Dining", "Storage & Organization", "Furniture", "Bath", "Bedding", "Home Decor", "Rugs", "Window Treatments", "Lamps & Lighting", "Kids’ Home", "Vacuums & Floor Care", "Home Appliances", "Home Improvement", "Luggage")),
                Arguments.of(2, "Baby", List.of("Baby", "Car Seats", "Strollers", "Diapering", "Nursery", "Gear & Activity", "Cribs", "Diaper Bags", "Baby Carriers", "Baby Toys", "Baby Monitors", "Health & Safety", "Bath & Potty", "Disposable Diapers", "Nursing & Feeding", "Formula", "Toddler", "Nursery Ideas & Inspiration")),
                Arguments.of(3, "Electronics", List.of("Electronics", "Video Games", "TV & Home Theater", "Cell Phones", "Wearable Tech", "Computers & Office", "Wi-Fi & Networking", "Smart Home", "Tablets & E-readers", "Headphones", "Speakers & Audio Systems", "Cameras & Camcorders", "Kids’ Electronics", "Pre-owned & Refurbished Electronics")),
                Arguments.of(4, "School & Office", List.of("School & Office", "Desk Organization", "Ready for School", "All College", "At-Home Learning", "Home Office Solutions")),
                Arguments.of(5, "Toys", List.of("Toys", "Character Shop", "Kids’ Play", "Stuffed Animals", "Dolls & Dollhouses", "Outdoor Toys", "Vehicles & Remote Control", "Action Figures & Playsets", "STEM", "Games", "Puzzles")),
                Arguments.of(6, "Sports, Fitness & Outdoors", List.of("Sports & Outdoors", "Exercise & Fitness", "Sports Equipment", "Pools & Accessories", "Bikes", "Camping Gear", "Fan Shop")),
                Arguments.of(7, "Entertainment", List.of("Movies", "TV Shows", "Music", "Books")),
                Arguments.of(8, "Beauty & Personal Care", List.of("Ulta Beauty at Target", "Beauty", "Personal Care", "Makeup", "Hair Care", "Skincare", "Fragrances", "Bath & Body", "Oral Care", "Deodorant", "Feminine Products", "Hair Removal & Shave", "Men’s Grooming")),
                Arguments.of(9, "Health", List.of("Health", "Vitamins & Supplements", "Medicines & Treatments", "Nutrition & Weight Loss", "First Aid", "Home Health Care", "Face Masks")),
                Arguments.of(10, "Household Essentials", List.of("Household Essentials", "Laundry Care", "Paper Towels", "Toilet Paper", "Cleaning Supplies")),
                Arguments.of(11, "Pets", List.of("Pets", "Dog Supplies", "Cat Supplies", "Small Animal Supplies", "Bird Supplies", "Fish Supplies")),
                Arguments.of(12, "Grocery", List.of("Grocery", "Produce", "Meat & Seafood", "Dairy", "Frozen Foods", "Snacks", "Beverages", "Deli", "Pantry", "Bakery & Bread", "Wine, Beer & Liquor")),
                Arguments.of(13, "Celebrations & more", List.of("Gift Ideas", "Party Supplies", "Halloween", "Christmas", "Easter", "Mother’s Day", "Father’s Day")),
                Arguments.of(14, "Deals & more", List.of("Top Deals", "Target Circle Offers", "Clearance", "Gift Cards", "Bullseye’s Playground", "Black Friday", "Cyber Monday", "Target Deal Days")),
                Arguments.of(15, "Services", List.of("Furniture Assembly by Handy", "Target Optical", "Easy Install by HelloTech", "New Parent Services by Tot Squad"))
        );
    }
}
