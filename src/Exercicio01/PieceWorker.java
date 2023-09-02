package Exercicio01;

public class PieceWorker extends Employee{
    private double wage;
    private int pieces;


    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDay, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDay);
        if(wage < 0) // check the wage
            throw new IllegalArgumentException("wage must be >= 0");
        if (pieces < 0)
            throw new IllegalArgumentException("Pieces must be > 0");
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return this.getWage() * this.getPieces();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%.2f%n%s%.2f%n%s%.2f", super.toString(), "Wage: ", this.getWage(), "Pieces: ", this.getWage(), "Earnings: ", this.earnings());
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0) // check the wage
            throw new IllegalArgumentException("wage must be >= 0");
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        if (pieces < 0)
            throw new IllegalArgumentException("Pieces must be > 0");
        this.pieces = pieces;
    }
}
