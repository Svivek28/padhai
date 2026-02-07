package out.vivek;
import java.util.*;

public class Tuf1 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        solve(arr);
    }

    public static void solve(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        // 2. Fill the Map (Frequency Counting)
        for (int x : arr) {
            // getOrDefault handles the first time a number appears
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = arr.length;
        int maxEle = 0;
        int minEle = 0;

        // 3. Iterate through the Map to find the results
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            // Find Highest Frequency
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            // Find Lowest Frequency
            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("maximum element --> "+maxEle + "\nmininum element --> " + minEle);
    }
}