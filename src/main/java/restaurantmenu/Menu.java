package restaurantmenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }


    public void updateMenu(MenuItem menuItem, String action) {
        if (action == "add") {
            menuItems.add(menuItem);
        } else if (action == "remove") {
            menuItems.remove(menuItem);
        } else {
            System.out.println("Not an accepted input: please include to either 'add' or 'remove' ");
        }
        lastUpdated =  new Date();
    }


    public void printItems(ArrayList menuItems, int index) {
//        if (index > menuItems.size()) {
//            System.out.println("enter a valid index to print an item");
//            return;
//        }

        if (index >= menuItems.size()) {
            System.out.println("***" + "\n");
            for (MenuItem anItem : this.menuItems) {
                System.out.println("item: " + anItem.toString() + "\n");
            }
            System.out.println("***");
        } else {
            MenuItem item = (MenuItem) menuItems.get(index);
            //test our determineNew method
//            System.out.println("item " + index + " pre determine: " + item.isNewItem());
//            item.determineNew();
//            System.out.println("item " + index + "post determine: " + item.isNewItem());

            System.out.println("item: " + item.toString() + "\n");


        }

    }
}

