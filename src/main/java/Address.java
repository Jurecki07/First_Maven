import org.apache.commons.lang3.StringUtils;

public class Address {
    private String street;

    public String getStreet() {
        return street;


    }

    public void setStreet(String street) {
        StringUtils.isBlank(street);      // Started to type this and you have to import from Apache

    }


    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet(null);
    }


}

