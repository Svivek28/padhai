package out.vivek;
//import java.util.*;
public class water {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int p=height.length;int s=0;
        int l=0,r=p-1;
        while(l<r)
                {long p1=(Math.min(height[l],height[r]))*Math.abs(l-r);
                if(p1>s)
                    s=(int)p1;
                if(height[l]<height[r])
                l++;
                else
                r--;
            }
        
        System.out.println(s);
        
    }
}
