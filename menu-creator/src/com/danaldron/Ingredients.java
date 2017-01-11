package com.danaldron;

public class Ingredients {
    private int id;
    private String name;
    private String amount;
    private String unit;
    private String recipeID;
    public Ingredients() {
    }
    public Ingredients(int id, String name, String amount, String unit, String recipeID) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.recipeID = recipeID;
    }
    public Ingredients(String name, String amount, String unit, String recipeID) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.recipeID = recipeID;
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
    public String getamount() {
        return amount;
    }
    public void setamount(String amount) {
        this.amount = amount;
    }
    public String getunit() {
        return unit;
    }
    public void setunit(String unit) {
        this.unit = unit;
    }

    public String recipeID() {
        return recipeID;
    }
    public void setrecipeID(String recipeID) {
        this.recipeID = recipeID;
    }
}