package com.subria.fi;

import com.subria.fi.exceptions.SalaryManagementException;
import com.subria.fi.models.Bonus;
import com.subria.fi.models.Person;
import com.subria.fi.models.Salary;
import com.subria.fi.models.Tax;
import com.subria.fi.utils.SalaryCalculationHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date currentDate= new Date();
        Bonus bonus1 = new Bonus(15,"basic"); // 10% bonus
        Bonus bonus2 = new Bonus(5,"Eid");  // 5% bonus
        List<Bonus> bonuses = List.of(bonus1, bonus2);
        Tax tax= new Tax(10);

        Salary salary= new Salary(currentDate,3500, bonuses, tax);
        Person person= new Person(1, "korim", "khan", "Developer", new ArrayList<>());
        person.setSalaryToList(salary);

        try {
            System.out.print("Total Monthly salary after tax reduction: "+ SalaryCalculationHelper.getTotalMonthlySalary(person,salary));
        } catch (SalaryManagementException e) {
            throw new RuntimeException(e);
        }
    }
}