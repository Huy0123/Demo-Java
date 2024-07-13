public class BasePlusCommissionEmployee extends CommissionEmployee {
    private final double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, SSN, grossSales, commissionRate);
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        else {
            this.baseSalary = baseSalary;
        }
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public void print() {
        System.out.print("Base-salaried ");
        super.print();
        System.out.println(STR."Base Salary: \{baseSalary}");
    }

}
