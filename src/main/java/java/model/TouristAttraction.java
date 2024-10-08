package java.model;

import java.util.List;

public class TouristAttraction {
    private String name;
    private String location;
    private double rating;
    private List<String> tags;

    // Constructor, Getters, and Setters

    public TouristAttraction(String name, String location, double rating, List<String> tags) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.tags = tags;
    }

    public TouristAttraction() {

    }

    public String getName() {
        return name;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
