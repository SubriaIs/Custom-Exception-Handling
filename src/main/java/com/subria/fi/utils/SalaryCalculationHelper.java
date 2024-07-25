package com.subria.fi.utils;

import com.subria.fi.exceptions.SalaryManagementException;
import com.subria.fi.models.Bonus;
import com.subria.fi.models.Person;
import com.subria.fi.models.Salary;

public final class SalaryCalculationHelper {

    private SalaryCalculationHelper(){
    }

    public static double getTotalMonthlySalary(Person person, Salary salary) throws SalaryManagementException {
        double totalBonus = 0.0;
        double salaryTax;

        for (Bonus bonus : salary.getBonus()) {
            if (bonus.getBonusPercentage() == 0 || bonus.getBonusPercentage()<0){
                    throw new SalaryManagementException("Bonus can't be empty or negative number!");

            }else{
                totalBonus += salary.getBasicSalary() * (bonus.getBonusPercentage() / 100.0);
            }
        }

        if(salary.getTax().getTaxPercentage()== 0 || salary.getTax().getTaxPercentage()<0){
                throw new SalaryManagementException("Tax can't be empty or negative number!");
        }else{
            salaryTax= salary.getBasicSalary()*(salary.getTax().getTaxPercentage()/100);
        }


        return (salary.getBasicSalary()+totalBonus)-salaryTax;
    }

}
