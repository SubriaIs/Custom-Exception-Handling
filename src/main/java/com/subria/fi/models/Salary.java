package com.subria.fi.models;

import java.util.Date;
import java.util.List;

public class Salary {
    private double basicSalary;
    private Date payableDate;
    private List<Bonus> bonuses;
    private Tax tax;

    public List<Bonus> getBonuses() {
        return bonuses;
    }

    public void setBonuses(List<Bonus> bonuses) {
        this.bonuses = bonuses;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Salary(Date payableDate, double basicSalary, List<Bonus> bonuses, Tax tax) {
        this.payableDate = payableDate;
        this.basicSalary = basicSalary;
        this.bonuses = bonuses;
        this.tax = tax;
    }

    public Date getPayableDate() {
        return payableDate;
    }

    public void setPayableDate(Date payableDate) {
        this.payableDate = payableDate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public List<Bonus> getBonus() {
        return bonuses;
    }

    public void setBonus(List<Bonus> bonuses) {
        this.bonuses = bonuses;
    }



    @Override
    public String toString() {
        return "Salary{" +
                "currentDate=" + payableDate +
                "basicSalary=" + basicSalary +
                ", bonus=" + bonuses +
                ", tax=" + tax +
                '}';
    }
}
