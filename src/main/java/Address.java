public class Address {
    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet(null);
    }
}

