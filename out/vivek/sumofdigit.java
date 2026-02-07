package out.vivek;
public class sumofdigit {
    public static void main(String[] args) {
        System.out.println(sod(127));

    }
    static int sod(int n)
    {
        if(n<10)
            return n;
        int p=n%10;
        return p+sod(n/10);
    }
}
