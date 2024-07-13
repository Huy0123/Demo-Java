public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = SSN;
    }
// Sua moi tai day
    public void print() {
        System.out.println(STR."\{firstName} \{lastName}");
        System.out.println(STR."social security number: \{socialSecurityNumber}");
    }

    public abstract double earnings();
}
