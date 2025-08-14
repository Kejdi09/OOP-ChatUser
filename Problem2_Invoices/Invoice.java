

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Invoice {
    private UUID id = UUID.randomUUID();
    private LocalDate invoice_date = LocalDate.now();
    private LocalDate due_date;
    private Customer customer;
    private ArrayList<Item> list;
    private double VAT;
    private double discount;
    private double total_cost;

    Invoice() {
        this.due_date = this.invoice_date.plusDays(7L);
        this.list = new ArrayList();
        this.VAT = (double)0.0F;
        this.discount = (double)0.0F;
        this.total_cost = (double)0.0F;
    }

    Invoice(LocalDate due_date, Customer customer) {
        this.due_date = due_date;
        this.list = new ArrayList();
        this.customer = customer;
        this.total_cost = this.calculateTotal_cost(this.list);
        this.VAT = 0.2 * this.total_cost;
        this.discount = this.calculateDiscount();
    }

    public double calculateTotal_cost(ArrayList<Item> list) {
        if (list.isEmpty()) {
            return (double)0.0F;
        } else {
            for(Item item : list) {
                this.total_cost += item.getItem_price();
            }

            return this.total_cost;
        }
    }

    public LocalDate getDue_date() {
        return this.due_date;
    }

    public void setDue_date(LocalDate due_date) {
        this.due_date = due_date;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Item> getList() {
        return this.list;
    }

    public void setList(ArrayList<Item> list) {
        this.list = list;
        this.total_cost = this.calculateTotal_cost(this.list);
        this.VAT = 0.2 * this.total_cost;
    }

    public void addItems(Item item) {
        if (this.list.size() < 10) {
            this.list.add(item);
            this.total_cost = this.calculateTotal_cost(this.list);
            this.VAT = 0.2 * this.total_cost;
        } else {
            System.out.println("There is no free space left to add a new item => your item was not added.");
        }

    }

    public double calculateDiscount() {
        return this.total_cost > (double)5000.0F ? this.total_cost * 0.1 : (double)0.0F;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("InvoiceID: ").append(this.id.toString()).append("\n");
        sb.append("Invoice Date: ").append(this.invoice_date.toString()).append("\n");
        sb.append("Due Date: ").append(this.due_date.toString()).append("\n\n");

        sb.append("Customer Name: ").append(this.getCustomer().getName()).append("\n");
        sb.append("Email: ").append(this.getCustomer().getEmail()).append("\n");
        sb.append("Address: ").append(this.getCustomer().getAdress()).append("\n\n");

        sb.append("Items:\n");
        for (Item item : this.list) {
            sb.append("Item Number: ").append(item.getItem_id())
                    .append(", Name: ").append(item.getItem_name())
                    .append(", Price: ").append(item.getItem_price())
                    .append(", Quantity on Hand: ").append(item.getQuantitySold())
                    .append("\n");
        }

        sb.append("\nTotal Cost (before VAT): ").append(this.total_cost).append("\n");
        sb.append("VAT(20%): ").append(this.VAT).append("\n");
        sb.append("Discount Applied: ").append(this.discount).append("\n");

        double totalAfterDiscount = this.total_cost - this.discount;
        sb.append("Total Cost (after Discount): ").append(totalAfterDiscount).append("\n");

        return sb.toString();
    }

}
