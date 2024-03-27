package com.example.quizappuser.Models;

public class CategoryModel {

    public String categoryName;
    public String categoryImage;
    public String key;
    public int setNum;

    public CategoryModel() {
    }

    public CategoryModel(String categoryName, String categoryImage, String key, int setNum) {
        this.categoryName = categoryName;
        this.categoryImage = categoryImage;
        this.key = key;
        this.setNum = setNum;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setSetNum(int setNum) {
        this.setNum = setNum;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public String getKey() {
        return key;
    }

    public int getSetNum() {
        return setNum;
    }
}
