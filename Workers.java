import com.sun.jdi.Value;

import java.util.*;

public class Workers {
    private static final Map<String, String> worksName = new HashMap<>();
    private static String value;

    void addWorker(String name, String lastName){
        worksName.put(name, lastName);
    }
    static void countName() {
        int count = 1;
        Map<String, String> worksNameCopy = new HashMap<>(worksName);
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair1 : worksName.entrySet()) {
            for (Map.Entry<String, String> pair2 : worksNameCopy.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue()))
                    list.add(pair1.getValue());
                count += 1;
            }
        }

        Map<String, String> copy = new HashMap<>(worksName);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                worksName.remove(pair.getKey());
            }
        }
        System.out.println(copy);
    }
}
