package out.vivek;

class LC1523 {
    public int countOdds(int low, int high) {
        int p=0;
        for(int i=low;i<=high;i++)
        {
            if(low%2!=0)
            p++;
        }
        return p;
    }
    public static void main(String[] args) {
        LC1523 ob =new LC1523();
        System.out.println(ob.countOdds(3, 7));
    }
}