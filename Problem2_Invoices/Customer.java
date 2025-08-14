
public class Customer {
    private String name;
    private String email;
    private String adress;

    Customer(String name, String email, String adress) {
        this.name = name;
        this.email = email;
        this.adress = adress;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAdress() {
        return this.adress;
    }
}
