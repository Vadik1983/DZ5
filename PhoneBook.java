import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> map = new HashMap<>();

    void add(String numPhone, String lastName){
        map.put(numPhone, lastName);
    }
    String getByNumPhone(String nunPhone){
        return nunPhone + " принадлежит: " + map.get(nunPhone);
    }

    String getByLastname(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry: map.entrySet())
            if (entry.getValue().equals(lastName)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        if (stringBuilder.length() == 0){
            return "Запись отсутствует!";
        }
        return stringBuilder.toString();
    }
    String getAllContact () {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}