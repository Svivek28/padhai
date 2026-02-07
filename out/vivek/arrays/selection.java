package out.vivek.arrays;

public class selection {
    public static void main(String[] args) {
         int m[]={7,8,9,1,2,3,4,5};
        select(m, m.length, 0, 0);
        for(int i:m)
        System.out.println(i);
    }
    static void select(int m[], int r , int c,int max)
    {
        if(r==0)
            return;
        if(c<r)
        {
            if(m[c]>m[max])
            select(m, r, c+1, c);
            else
                select(m, r, c+1, max);
        }
        else{
            int temp=m[max];
            // select(m, r, c, max);
            m[max]=m[r-1];
            m[r-1]=temp;
            select(m, r-1, 0, 0);
    }
    
}
}