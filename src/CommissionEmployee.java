public class CommissionEmployee extends Employee {
    private final double grossSales;
    private final double commissionRate;


    public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate) {
        super(firstName, lastName, SSN);
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        else {
            this.grossSales = grossSales;
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        else {
            this.commissionRate = commissionRate;
        }
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public void print() {
        System.out.print("Commission Employee: ");
        super.print();
        System.out.println(STR."Gross Sales: \{grossSales}");
        System.out.println(STR."Commission Rate: \{commissionRate}");
    }
}
