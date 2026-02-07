package out.vivek.arrays;
public class sorted {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6,8,4};
        System.out.println(sort(n, 0));
    }
    static boolean sort(int n[],int index)
    {
        if(index==n.length-1)
            return true;
        return n[index]<n[index+1] && sort(n, index+1);
    }
}
