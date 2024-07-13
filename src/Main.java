import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        employees[1] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
        employees[2] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
        for (var employee : employees) {
            employee.print();
            printEarnings(employee);
            System.out.println();
        }

    }
    public static void printEarnings(Employee employee) {
        System.out.println(STR."Earnings: $\{employee.earnings()}");
    }
    @DisplayName("Test Employee Earnings")
    @Test
    public void testEarnings() {
        var employees = new Employee[3];
        employees[0] = new SalariedEmployee("John", "Smith", "111111111", 800.00);
        employees[1] = new CommissionEmployee("Sue", "Jones", "333333333", 10000, 0.06);
        employees[2] = new BasePlusCommissionEmployee("Bob", "Lewis", "444444444", 5000, 0.04, 300);
        assertEquals(800.00, employees[0].earnings());
        assertEquals(10000 * 0.06, employees[1].earnings());
        assertEquals(300 + 5000 * 0.04, employees[2].earnings());
    }
    @DisplayName("Test WeeklySalary Exception")
    @Test
    public void testWeeklySalary() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
            new SalariedEmployee("John", "Smith", "111111111", -800.00)
        );
        assertEquals("Weekly salary must be >= 0.0",exception.getMessage());
    }
    @DisplayName("Test GrossSales Exception")
    @Test
    public void testGrossSales() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
            new CommissionEmployee("Sue", "Jones", "333333333", -10000, 0.06)
        );
        assertEquals( "Gross sales must be >= 0.0",exception.getMessage());
    }
    @DisplayName("Test CommissionRate Exception")
    @Test
    public void testCommissionRate() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
            new CommissionEmployee("Sue", "Jones", "333333333", 10000, 1.06)
        );
        assertEquals("Commission rate must be > 0.0 and < 1.0",exception.getMessage());
    }
    @DisplayName("Test BaseSalary Exception")
    @Test
    public void testBaseSalary() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->
            new BasePlusCommissionEmployee("Bob", "Lewis", "444444444", 5000, 0.04, -300)
        );
        assertEquals("Base salary must be >= 0.0",exception.getMessage());
    }


}
