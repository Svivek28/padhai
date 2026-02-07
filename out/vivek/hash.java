package out.vivek;

import java.util.HashMap;
import java.util.Map;

public class hash{
    
    public static void main(String[] args){

        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        for(int i=65;i<=90;i++)
        {
            char b=(char)i;
            
            hashMap.put(Character.toString(b), i);
            
        }
        System.out.println(hashMap);
        // hashMap.put("Jane", 30);
        // hashMap.put("Jim", 35);

        // Iterate through the HashMap
        // for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }
    }
}