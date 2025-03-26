import java.util.HashMap;
import java.util.Set;

public class OccurrenceOfRepeatedWords {

    public static void main(String[] args) {
        String str = "my my is is name abc abcd abc";
        OccurrenceOfRepeatedWords o = new OccurrenceOfRepeatedWords();
        o.findRepeatedOccurrence(str);
    }

    public void findRepeatedOccurrence(String value){
        String [] strArray = value.split(" ");
        HashMap<String, Integer> m = new HashMap<>();

        for(String s: strArray){
            if(m.containsKey(s)){
                m.put(s, m.get(s)+1);
            } else {
                m.put(s, 1);
            }
        }

        Set<String> set = m.keySet();
        for (String s: set){
            if(m.get(s) >= 2){
                System.out.println("Key is " + s + " and value is " + m.get(s));
            }
        }
    }
}
