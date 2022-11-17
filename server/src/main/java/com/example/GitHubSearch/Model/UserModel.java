package com.example.GitHubSearch.Model;

public class UserModel {

    public UserModel() {}

    //Constructor to store data in the instance variables
    public UserModel(Integer id, String title, String url, String image) {
        super();
        this.id = id;
        this.title = title;
        this.url = url;
        this.image = image;
    }


    //Variables
    private Integer id;
    private String title;
    private String url;
    private String image;

    @Override
    public String toString() {
        return "User [id=" + id + ", title=" + title + ", url=" + url + ", image=" + image +"]";
    }

    //Setters and Getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}