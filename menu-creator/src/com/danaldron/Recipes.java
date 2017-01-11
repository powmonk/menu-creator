package com.danaldron;

public class Recipes {
    private int id;
    private String name;
    private String course;
    private String category;
    public Recipes() {
    }
    public Recipes(int id, String name, String course, String category) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.category = category;
    }
    public Recipes(String name, String course, String category) {
        this.name = name;
        this.course = course;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getcourse() {
        return course;
    }
    public void setcourse(String course) {
        this.course = course;
    }
    public String getcategory() {
        return category;
    }
    public void setcategory(String category) {
        this.category = category;
    }
}