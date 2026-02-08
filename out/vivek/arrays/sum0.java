package out.vivek.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class sum0 {

    public static void main(String[] args) {
        int m[]={-8 ,-10 ,-10 ,-10, 10, 6, 1, 10};
        Arrays.sort(m);
        int k=0;
        System.out.println(sum00(m,k));
    }
    static ArrayList<ArrayList<Integer>> sum00(int arr[],int k)
    {
        int left=0,right=arr.length-1; int i=0;
        ArrayList<ArrayList<Integer>> n=new ArrayList<>();
        while(left<right)
        {ArrayList<Integer> m=new ArrayList<>();
            int sum=arr[left]+arr[right];
             if(sum==0) {
                m.add(left);
                m.add(right);
                n.add(m);
                i++;} 
                else if (sum<0) 
                    left++; 
                else 
                    right--; } 
                return n;
    }
}

