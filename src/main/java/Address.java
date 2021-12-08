import lombok.Data;

@Data
public class Address {
    private String value;

    private String country;
    private String city;

    public Address(String value) {
        this.value = value;
    }

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }
}
