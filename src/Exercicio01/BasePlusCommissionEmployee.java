package Exercicio01;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary,Date birthday) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, birthday);
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base Salary must be >= 0");
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return  String.format("%s: %n%s %.2f%n%s%.2f", super.toString(), "BaseSalary = ", this.getBaseSalary(), "CommissionRate = ", this.getCommissionRate());
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException("Base Salary must be >= 0");
        this.baseSalary = baseSalary;
    }
}
