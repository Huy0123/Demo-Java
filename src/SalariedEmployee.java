public class SalariedEmployee extends Employee {
    private final double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        else {
            this.weeklySalary = weeklySalary;
        }
    }

    @Override
    public void print() {
        System.out.print("Salaried Employee: ");
        super.print();
        System.out.println(STR."Weekly Salary: \{earnings()}");
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}
