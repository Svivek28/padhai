package out.vivek;

import java.util.Arrays;

public class divisible {
    public static void main(String[] args) {
        int nums[]={3,5,6,1,8};
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
             s=s+nums[i];
        }
       //System.out.println(s);
       // Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(s%3==0)
                {System.out.println(s);
                }
            else
            {
                int p=s-nums[i];
                if(p%3==0)
               { System.out.println(p);
                break;}
            }
    }
}
}
