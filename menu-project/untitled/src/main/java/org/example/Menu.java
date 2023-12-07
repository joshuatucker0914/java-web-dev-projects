package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private List<MenuItem> items;
    private Date lastUpdated;

    // Constructor
    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date(); // Initialize with the current date
    }

    // Add a new MenuItem to the menu
    public void addMenuItem(MenuItem item) {
        items.add(item);
        updateLastUpdated();
    }

    // Remove a MenuItem from the menu
    public void removeMenuItem(String itemName) {
        for (MenuItem item : items) {
            if (item.getName().equals(itemName)) {
                items.remove(item);
                break; // Stop the loop after removing the item
            }
        }
        updateLastUpdated();
    }

    // Getters
    public List<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    // Helper method to update the lastUpdated date
    private void updateLastUpdated() {
        this.lastUpdated = new Date();
    }
}
