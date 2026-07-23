package com.hotelbookingpro.model;

import java.util.List;

public class Hotel {
    private Long id;
    private String name;
    private String city;
    private String price;
    private String description;
    private List<String> images;
    private List<String> features;
    private String rating;
    private String badge;

    public Hotel(Long id, String name, String city, String price, String description, List<String> images, List<String> features, String rating, String badge) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.price = price;
        this.description = description;
        this.images = images;
        this.features = features;
        this.rating = rating;
        this.badge = badge;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<String> getImages() { return images; }
    public void setImages(List<String> images) { this.images = images; }

    public List<String> getFeatures() { return features; }
    public void setFeatures(List<String> features) { this.features = features; }

    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }

    public String getBadge() { return badge; }
    public void setBadge(String badge) { this.badge = badge; }
}
