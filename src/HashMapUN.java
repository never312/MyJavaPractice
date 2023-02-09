import java.util.HashMap;
import java.util.Map;

public class HashMapUN {

    public Map<Integer, String> reversed(Map<String, Integer> hashmap){
        Map<Integer, String> inverseMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : hashmap.entrySet()){
            inverseMap.put(entry.getValue(), entry.getKey());
        }
        return (inverseMap);
    }

    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("A", 1);
        hashmap.put("B", 2);
        hashmap.put("C", 3);
        hashmap.put("D", 4);
        Map<Integer, String> inverseMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : hashmap.entrySet()){
            inverseMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println(inverseMap);
    }

}
