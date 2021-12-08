import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        var jsonExampleWithStr =
                "{\"name\": \"Memmed\", \"address\": \"Baku\"}";
        var jsonExampleWithObj =
                "{\"name\": \"Memmed\", \"address\": {\"city\": \"Baku\", \"country\": \"Azerbaijan\"}}";

        Person p1 = mapper.readValue(jsonExampleWithStr, Person.class);
        Person p2 = mapper.readValue(jsonExampleWithObj, Person.class);

        System.out.println(p1);
        System.out.println(p2);
    }
}
