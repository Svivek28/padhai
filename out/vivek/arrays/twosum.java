package out.vivek.arrays;

public class twosum {
    public static void main(String[] args) {
        int m[]={-1,1,0,1,-1};
        int k=0;
        System.out.println(sum2(m,k));
    }
    static boolean sum2(int m[],int k)
    {
        int left=0,right=m.length-1;
        while(left<right)
        {
            int sum=m[left]+m[right];
            if(sum==k)
                return true;
            else if (sum<k)
                left++;
            else
                right--;
        }
        return false;
    }
}
