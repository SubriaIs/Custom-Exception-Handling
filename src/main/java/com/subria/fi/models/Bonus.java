package com.subria.fi.models;

public class Bonus {

    private int bonusPercentage;
    private String bonusType;


    public Bonus(int bonusPercentage,String bonusType) {
        this.bonusPercentage = bonusPercentage;
        this.bonusType = bonusType;

    }

    public int getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(int bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType;
    }



    @Override
    public String toString() {
        return "Bonus{" +
                "bonusPercentage=" + bonusPercentage +
                "bonusType="+ bonusType+
                '}';
    }
}
