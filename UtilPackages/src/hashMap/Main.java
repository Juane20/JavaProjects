package hashMap;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> participants = new HashMap<String, Integer>();
        participants.put("Elias", 19);
        participants.put("Nat", 19);
        participants.put("Brunito", 1);
        participants.put("Nico", 18);
        System.out.println(participants.get("Elias"));
        for(String i : participants.keySet()){
            System.out.println(i);
        }
    }

}
