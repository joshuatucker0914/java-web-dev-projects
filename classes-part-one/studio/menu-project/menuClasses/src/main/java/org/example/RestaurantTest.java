package org.example;

public class RestaurantTest {
    public static void main(String[] args) {
        // Create menu items
        MenuItem item1 = new MenuItem("Fancy Pizza", 12.99, "A real fancy.", "Dinner", false);
        MenuItem item2 = new MenuItem("Chocolate Brownie", 6.99, "Delicious chocolate brownie.", "Dessert", true);

        // Create a menu
        Menu menu = new Menu();

        // Add menu items to the menu
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);

        // Display menu
        displayMenu(menu);

        // Update a menu item
        MenuItem updatedItem = new MenuItem("Fanciest Pizza", 14.99, "The fanciest pizza ever. Trust me bro.", "Dinner", false);
        menu.addMenuItem(updatedItem);

        // Remove a menu item
        menu.removeMenuItem("Chocolate Brownie");

        // Display updated menu
        displayMenu(menu);
    }

    // Helper method to display the menu
    private static void displayMenu(Menu menu) {
        System.out.println("Menu:");
        for (MenuItem item : menu.getItems()) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Is New: " + item.isNew());
            System.out.println("--------------------");
        }
        System.out.println("Last Updated: " + menu.getLastUpdated());
        System.out.println("--------------------\n");
    }
}