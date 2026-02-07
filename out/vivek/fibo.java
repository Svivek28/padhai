package out.vivek;

public class fibo {
    public static void main(String[] args) {
        //for(int i=0;i<100;i++)
            System.out.println(Fibo(50));
    }
    static int Fibo(int n)
    {
        if (n<2)
            return n;
        return Fibo(n-1)+Fibo(n-2);
    }
}
