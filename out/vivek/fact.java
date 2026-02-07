package out.vivek;

public class fact {
    public static void main(String[] args) {
        System.out.println(Fact(34));
    }
    static double Fact(int n)
    {
        if(n==0|| n==1)
            return n;
        return n*(Fact(n-1));
    }
}
