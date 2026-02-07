package out.vivek;
public class rev {
    public static void main(String[] args) {
       // System.out.println(revv(1824));
        System.out.println(revv2(121));
        System.out.println(revv3(121));
    }
    // static int sum=0;
    // static int revv(int n)
    // {
        
    //     if(n==0)
    //         return n;
    //     int p=n%10;
    //     sum=sum*10+p;
    //     revv(n/10);
    //     return sum;
    // }
    static int revv2(int n)
    {
        int digit=(int)(Math.log10(n))+1;
        return helper(n,digit);
    }

        private static int helper(int n, int digit)
        {
            if(n%10==n)
                return n;
            int rem=n%10;
            return rem*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
        }
        static boolean revv3(int n)
        {
            return n==revv2(n);
        }

    }

