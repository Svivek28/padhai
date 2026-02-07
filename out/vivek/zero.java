package out.vivek;
public class zero {
    public static void main(String[] args) {
        System.out.println(gola(303040));
    }
    static int gola(int n)
    {
        return help(n,0);
    }
    private static int help(int n, int c)
    {
        if(n==0)
            return c;
        int rem=n%10;
        if(rem==0)
            return help(n/10,c+1);
        return help(n/10,c);
    }
}
