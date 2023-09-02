package Exercicio01;

public abstract class Employee {
    private  String firstName;
    private String lastName;
    private String socialSecurityNumber;

    private Date birthDay;


    public Employee(){

    }
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDay = birthDay;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return  String.format("%s %s%nSocial Security Number: %s", this.getFirstName(), this.lastName, this.getSocialSecurityNumber());
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
