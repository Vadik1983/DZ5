import java.util.HashMap;
import java.util.Map;

public class Workers {
    private static final Map<String, String> worksName = new HashMap<>();

    void addWorker(String name, String lastName){
        worksName.put(name, lastName);
    }
    void countName(){

    }
}
