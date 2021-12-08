import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Map;

@Data
public class Person {
    String name;

    @JsonIgnore
    Address address;

    @JsonAnySetter
    public void setAddressDynamically(String k, Object v) {
        if (v instanceof String) {
            this.address = new Address((String) v);
        }

        if (v instanceof Map) {
            var city = ((Map<String, String>) v).get("city");
            var country = ((Map<String, String>) v).get("country");
            this.address = new Address(city, country);
        }
    }
}
