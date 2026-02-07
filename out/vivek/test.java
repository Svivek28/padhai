package out.vivek;
class Solution12 {

    public static void main(String args[])
    {
        int p=0;
        int coins[]={1,2,5};
        int sum=30;
        // code here
        while(sum>0)
        {
            for(int i=0;i<coins.length;i++)
            {
             p=sum%coins[i]+p;
             sum=sum/coins[i];
            }
        }
        System.out.println(p);
    }
}