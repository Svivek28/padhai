package out.vivek.arrays;

import java.util.ArrayList;

public class check {
    public static void main(String[] args) {
        ArrayList<Integer> n= new ArrayList<>();
        int m[]={1,2,3,4,4,8};
        int k=4;
        System.out.println(check1(m, k, 0, n));
        System.out.println(check2(m, k, 0));
    }
    static ArrayList<Integer> check1(int a[],int k, int index, ArrayList<Integer> n)
    {
        if(index==a.length)
            return n;
        if(a[index]==k)
            n.add(index+1);
        return check1(a, k, index+1, n);
    }
//     package out.vivek.arrays;

// import java.util.ArrayList;

// public class check {
//     public static void main(String[] args) {
//         ArrayList<Integer> n= new ArrayList<>();
//         int m[]={1,2,3,4,4,8};
//         int k=4;
//         System.out.println(check1(m, k, 0));
//     }
    static ArrayList<Integer> check2(int a[],int k, int index)
    {
        ArrayList<Integer> n=new ArrayList<>();
        if(index==a.length)
            return n;
        if(a[index]==k)
            n.add(index+1);
        
         ArrayList<Integer> belowcalls= check2(a, k, index+1);
         n.addAll(belowcalls);

         return n;
    }

     
}
 
