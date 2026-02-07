package out.vivek;
public class productofdigit {
    public static void main(String[] args) {
        System.out.println(pod(127));

    }
    static int pod(int n)
    {
        if(n%10==n)
            return n;
        int p=n%10;
        return p*pod(n/10);
    }
}

