package com.random.malay.monthlyexpensetracker;

/**
 * Created by Malay on 7/9/2015.
 */
public class DataProvider {

    private String date;
    private String description;
    private String category;
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public DataProvider(String date, String description, String category, String amount){
        this.date = date;
        this.description = description;
        this.category = category;
        this.amount = amount;


    }

}
