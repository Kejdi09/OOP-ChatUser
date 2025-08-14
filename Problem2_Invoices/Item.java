
public class Item {
    private int item_id;
    private static int count = 0;
    private String item_name;
    private double item_price;
    private int quantitySold;

    Item(String item_name, double item_price, int quantitySold) {
        this.item_id = ++count;
        this.item_name = item_name;
        this.item_price = item_price;
        this.quantitySold = quantitySold;
    }

    public double getItem_price() {
        return this.item_price;
    }

    public int getItem_id() {
        return this.item_id;
    }

    public String getItem_name() {
        return this.item_name;
    }

    public int getQuantitySold() {
        return this.quantitySold;
    }
}
