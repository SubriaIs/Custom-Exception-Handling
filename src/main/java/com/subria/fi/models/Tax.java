package com.subria.fi.models;

public class Tax {
    private double taxPercentage;

    public Tax(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "taxPercentage=" + taxPercentage +
                '}';
    }
}
