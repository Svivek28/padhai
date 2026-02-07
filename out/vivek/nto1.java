package out.vivek;
public class nto1 {
    public static void main(String[] args) {
        //fun(5);
        funrev(7);
    }
    static void fun(int n)
    {
        if(n==0)
            return;
        System.out.println(n+" ");
        fun(n-1);
    }
    static void funrev(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        funrev(n-1);
        System.out.println(n);
        
    }
}
