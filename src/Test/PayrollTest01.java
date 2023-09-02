package Test;

import Exercicio01.*;

public class PayrollTest01 {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Dean", "Winchester", "111-11-111", 1000, new Date(20, 4, 2001));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bruce", "Wayne", "222-22-222", 15.0, 30, new Date(10, 4, 2000));
        CommissionEmployee commissionEmployee = new CommissionEmployee("Wally", "West", "333-33-333", 4000, 0.4, new Date(25, 12, 31));
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Clark", "Kent", "444-44-444", 2000, 0.5, 3000, new Date(1, 2, 1999));

        System.out.println("\nEmployees processed individually: ");

        System.out.printf("%n%s%n%s%.2f%n", salariedEmployee, "earned: ", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s%.2f%n", hourlyEmployee, "earned: ", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s%.2f%n", commissionEmployee, "earned: ", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s%.2f%n", basePlusCommissionEmployee, "earned: ", basePlusCommissionEmployee.earnings());

        birthday(salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee);


    }

    public static void birthday(SalariedEmployee salariedEmployee, HourlyEmployee hourlyEmployee, CommissionEmployee commissionEmployee, BasePlusCommissionEmployee basePlusCommissionEmployee) {
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("\n==========================\n");

        System.out.println("Employees processed polymorphically : \n");


        for (Employee e : employees) {
            System.out.println(e);

            if (e.getClass() == salariedEmployee.getClass()) {
                SalariedEmployee salariedEmployee1 = (SalariedEmployee) e;
                if (salariedEmployee1.getBirthDay().getMonth() == 4) {
                    salariedEmployee1.setWeeklySalary(100 + salariedEmployee1.getWeeklySalary());
                    System.out.printf("New WeeklySalary with 10%% increase is: %.2f%n", salariedEmployee1.getWeeklySalary());
                    System.out.printf("Earned: %s%n", salariedEmployee.earnings());
                }
            }

            if (e.getClass() == hourlyEmployee.getClass()) {
                HourlyEmployee hourlyEmployee1 = (HourlyEmployee) e;

                if (hourlyEmployee1.getBirthDay().getMonth() == 4) {
                    hourlyEmployee1.setWage(hourlyEmployee1.getWage()*0.1 + hourlyEmployee1.getWage());
                    System.out.printf("New Wage with 10%% increase is: %.2f%n", hourlyEmployee1.getWage());
                    System.out.printf("Earned: %s%n", hourlyEmployee1.earnings());
                }
            }

            if (e.getClass() == commissionEmployee.getClass()) {
                CommissionEmployee commissionEmployee1 = (CommissionEmployee) e;

                if (commissionEmployee1.getBirthDay().getMonth() == 4) {
                    commissionEmployee1.setGrossSales(100 + commissionEmployee1.getGrossSales());
                    System.out.printf("New GrossSales with 10%% increase is: %.2f%n", commissionEmployee1.getGrossSales());
                    System.out.printf("Earned: %s%n%n", commissionEmployee1.earnings());
                }
            }

            if (e.getClass() == basePlusCommissionEmployee.getClass()) {
                BasePlusCommissionEmployee basePlusCommissionEmployee1 = (BasePlusCommissionEmployee) e;

                if (basePlusCommissionEmployee1.getBirthDay().getMonth() == 4) {
                    basePlusCommissionEmployee1.setBaseSalary(100 + basePlusCommissionEmployee1.getBaseSalary());
                    System.out.printf("New BaseSalary with 10%% increase is: %.2f%n", basePlusCommissionEmployee1.getGrossSales());
                    System.out.printf("Earned: %s%n%n", basePlusCommissionEmployee1.earnings());
                }
            }
            System.out.println();
        }

    }
}
