package Test;

import Exercicio01.*;

public class PayrollTest02 {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Dean", "Winchester", "111-11-111", 1000, new Date(20, 4, 2001));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bruce", "Wayne", "222-22-222", 15.0, 30, new Date(10, 4, 2000));
        CommissionEmployee commissionEmployee = new CommissionEmployee("Wally", "West", "333-33-333", 4000, 0.4, new Date(25, 12, 31));
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Clark", "Kent", "444-44-444", 2000, 0.5, 3000, new Date(1, 2, 1999));
        PieceWorker pieceWorker = new PieceWorker("Barry", "Allen", "444-44-444", new Date(4,6,2005), 10.0, 100);

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        for(Employee e : employees){
            System.out.printf("%n%s%n", e.toString());
        }
    }
}
