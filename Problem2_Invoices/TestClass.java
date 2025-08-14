
import java.time.LocalDate;

public class TestClass {
    public static void main(String[] args) {
        Customer c = new Customer("John Joel", "john.joel@domain.com", "Center Tirana");
        LocalDate due_date = LocalDate.of(2025, 10, 2);
        Invoice inv = new Invoice(due_date, c);
        inv.addItems(new Item("Laptop", (double)800.0F, 1));
        inv.addItems(new Item("Mouse", (double)20.0F, 2));
        System.out.println(inv);
    }
}
