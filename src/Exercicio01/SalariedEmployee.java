package Exercicio01;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, Date birthday) {
        super(firstName, lastName, socialSecurityNumber, birthday);
        if(weeklySalary < 0)
            throw new IllegalArgumentException("Weekly Salary must be >= 0");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return this.getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%s %n%s%.2f%n%s%.2f", super.toString(), "Weekly Salary = ", this.getWeeklySalary(),"Earnings: ", this.earnings());
    }

    public double getWeeklySalary() {
        return this.weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0)
            throw new IllegalArgumentException("Weekly Salary must be >= 0");
        this.weeklySalary = weeklySalary;
    }
}
