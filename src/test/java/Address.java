import org.apache.commons.lang3.StringUtils;

public class Address {
    private String street;

    public String getStreet() {
        return street;


    }

    public void setStreet(String street) throws IllegalArgumentException {
       if (StringUtils.isBlank(street)) {
           throw new IllegalArgumentException();
       }
       }






    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet(null);
    }


}
