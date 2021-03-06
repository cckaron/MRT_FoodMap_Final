package tw.com.team13.model;

import com.google.firebase.firestore.IgnoreExtraProperties;

/**
 * @author Chun-Kai Kao on 2018/5/26 01:34
 * @github http://github.com/cckaron
 */

@IgnoreExtraProperties
public class Restaurant {

    public static final String FIELD_CITY = "city";
    public static final String FIELD_CATEGORY = "category";
    public static final String FIELD_PRICE = "price";
    public static final String FIELD_POPULARITY = "numRatings";
    public static final String FIELD_AVG_RATING = "avgRating";
    public static final String FIELD_INTRO = "Description";

    private String name;
    private String city;
    private String category;
    private String photo;
    private int price;
    private int numRatings;
    private double avgRating;
    private String Description;

    public Restaurant() {
    }

    public Restaurant(String name, String city, String category, String photo, int price, int numRatings, double avgRating, String description) {
        this.name = name;
        this.city = city;
        this.category = category;
        this.photo = photo;
        this.price = price;
        this.numRatings = numRatings;
        this.avgRating = avgRating;
        Description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumRatings() {
        return numRatings;
    }

    public void setNumRatings(int numRatings) {
        this.numRatings = numRatings;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", category='" + category + '\'' +
                ", photo='" + photo + '\'' +
                ", price=" + price +
                ", numRatings=" + numRatings +
                ", avgRating=" + avgRating +
                ", Description='" + Description + '\'' +
                '}';
    }
}



