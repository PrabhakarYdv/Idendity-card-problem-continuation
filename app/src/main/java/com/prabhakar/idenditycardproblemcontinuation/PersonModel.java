package com.prabhakar.idenditycardproblemcontinuation;

public class PersonModel {
    private int img;
    private String age;
    private String companyName;
    private String profession;

    public PersonModel(int img, String age, String companyName, String profession) {
        this.img = img;
        this.age = age;
        this.companyName = companyName;
        this.profession = profession;
    }

    public int getImg() {
        return img;
    }

    public String getAge() {
        return age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getProfession() {
        return profession;
    }
}