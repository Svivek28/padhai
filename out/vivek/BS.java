package out.vivek;

public class BS {
    public static void main(String[] args) {
        int m[]={1,2,3,4,55,66,77,88};
        int t=67;
        System.out.println(search(m, t, 0, m.length-1));
    }
    static int search(int m[],int t, int s, int e)
    {
        if(s>e)
            return -1;
        int p=s+(e-s)/2;
        if(m[p]==t)
            return p;
        if(t<m[p])
            return search(m, t, s, p-1);
        return search(m, t, p+1, e);
    }
}
