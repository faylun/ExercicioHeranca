package Exercicio01;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours, Date birthday) {
        super(firstName, lastName, socialSecurityNumber, birthday);

        if(wage < 0) // check the wage
            throw new IllegalArgumentException("wage must be >= 0");
        if(hours <= 0 || hours >= 168) // check the hours
            throw new IllegalArgumentException("hours must be > 0 and <= 168");

        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0) // check the wage
            throw new IllegalArgumentException("wage must be >= 0");
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours <= 0 || hours >= 168) // check the hours
            throw new IllegalArgumentException("hours must be > 0 and <= 168");
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return this.getWage() * this.getHours();
    }
    @Override
    public String toString() {
        return  String.format("%s: %n%s %.2f%n%s%.2f%n%s%.2f", super.toString(), "Wage = ", this.getWage(), "Hours = ", this.getHours(), "Earnings: ", this.earnings());
    }
}
