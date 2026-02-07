package out.vivek.arrays;

import java.util.ArrayList;

public class Linear {
    public static void main(String[] args) {
        int m[]={1,9,4,6,9,5,8,9};
        int k=9;
        //System.out.println(lsort(m,k,0));
        Alllsort(m, k, 0);
        System.out.println(n1);
    }
    static int lsort(int m[],int k,int index)
    {
        if(m[index]==k)
            return index+1;
        if(index>m.length)
            return -1;
        return (lsort(m, k, index+1));

    }
    static ArrayList<Integer> n1=new ArrayList<>();
    static void Alllsort(int m[],int k,int index)
    {
        
        if(m[index]==k)
            n1.add(index);
        if(index==m.length-1)
            return;
      Alllsort(m, k, index+1);

    }
}
