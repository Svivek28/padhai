package out.vivek;
import java.util.*;
class square
{
    public static double sqrt(double c)
    {
        if (c<0)
            return Double.NaN;
        double err=1e-15;
        double t =c;
        while(Math.abs(t-c/t)>err*t)
        {
            t=(c/t +t)/2.0;
        }
        return t;
    }
        public static void main(String[] args) {
            square ob=new square();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number for which you want the square root of that");
            double p=sc.nextDouble();
            System.out.println(ob.sqrt(p));
        }
    }
