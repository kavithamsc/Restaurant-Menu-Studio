package restaurantmenu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MenuItem {
    private String courseName;
    private double price;
    private String courseDescription;
    private String category;
    private boolean isNew;
    private dateUpdated;

    public MenuItem(String courseName) {
        this.courseName = courseName;
    }

    public MenuItem() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public MenuItem(boolean isNew) {
        this.isNew = isNew;
    }

    public void determineNew() {
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -30);
        Date today30 = cal
    }

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem();
        item1.setCourseName("Pasta");
        item1.setPrice(10.99);
        item1.setCourseDescription("Delicious pasta with chicken, beef, seafood");
        item1.setCategory("Main Course");
        item1.setNew(true);

        MenuItem item2 = new MenuItem();
        item2.setCourseName("Salad");
        item2.setPrice(8.99);
        item2.setCourseDescription("Delicious salad with your choice chicken, beef, seafood ");
        item2.setCategory("Main Course");
        item2.setNew(true);

        MenuItem item3 = new MenuItem();
        item3.setCourseName("Cheesecake");
        item3.setPrice(7.99);
        item3.setCourseDescription("Creamy cheesecake with a graham cracker crust");
        item3.setCategory("Dessert");
        item3.setNew(true);

        // Create a menu and add items to it
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);

    }
}