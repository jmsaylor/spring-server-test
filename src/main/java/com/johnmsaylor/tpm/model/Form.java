package com.johnmsaylor.tpm.model;

public class Form {
    public String favoriteThing;
    public String ideas;
    public String leastFavoriteThing;
    public String[] reasons;
    public Integer rating;

    public Form() {}

    public Form(String favoriteThing, String ideas, String leastFavoriteThing, String[] reasons, Integer rating) {
        this.favoriteThing = favoriteThing;
        this.ideas = ideas;
        this.leastFavoriteThing = leastFavoriteThing;
        this.reasons = reasons;
        this.rating = rating;
    }

    public String getFavoriteThing() {
        return favoriteThing;
    }

    public void setFavoriteThing(String favoriteThing) {
        this.favoriteThing = favoriteThing;
    }

    public String getIdeas() {
        return ideas;
    }

    public void setIdeas(String ideas) {
        this.ideas = ideas;
    }

    public String getLeastFavoriteThing() {
        return leastFavoriteThing;
    }

    public void setLeastFavoriteThing(String leastFavoriteThing) {
        this.leastFavoriteThing = leastFavoriteThing;
    }

    public String[] getReasons() {
        return reasons;
    }

    public void setReasons(String[] reasons) {
        this.reasons = reasons;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
