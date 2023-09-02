package Exercicio01;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, Date birthday) {
        super(firstName, lastName, socialSecurityNumber, birthday);
        if (grossSales < 0)
            throw new IllegalArgumentException("Gross sales must be >= 0");
        else if (commissionRate <= 0 || commissionRate >= 1)
            throw new IllegalArgumentException("Commission Rate must be > 0 <= 1");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    @Override
    public double earnings(){

        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return  String.format("%s: %n%s %.2f%n%s%.2f%n%s%.2f", super.toString(), "GrossSales = ", this.getGrossSales(), "CommissionRate = ", this.getCommissionRate(),
                "Earnings: ", this.earnings());
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0)
            throw new IllegalArgumentException("Gross Sales must be >= 0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0 || commissionRate >= 1)
            throw new IllegalArgumentException("Commission Rate must be >= 0");
        this.commissionRate = commissionRate;
    }
}
