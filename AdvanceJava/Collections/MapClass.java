package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        String str = "HelloWorld";
        int hashCode = str.hashCode();
        System.out.println("Hash code of the string \"" + str + "\" is: " + hashCode);

        // find frequency of characters in a string using Map
        String input = "programming";
        Map<Character, Integer> charFreq = new HashMap<Character, Integer>();
        for(char c : input.toCharArray()){
            if(charFreq.containsKey(c)){
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c, 1);
            }
        }
        System.out.println("Character frequencies in the string \"" + input + "\": " + charFreq);
        

        
    }

}
