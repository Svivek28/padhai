package out.vivek.arrays;
import java.util.*;

public class twosum2 {
    class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n[]=new int[2];
        int left=0,right=numbers.length-1; int i=0;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
             if(sum==target) {
                n[0]=left+1;
                n[1]=right+1;}
                else if (sum<0) 
                    left++; 
                else 
                    right--; } 
                return n;
    }
}

    }