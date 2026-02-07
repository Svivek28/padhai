package out.vivek.arrays;

public class RotatedBS {
    public static void main(String[] args) {
     int m[]= {5,6,7,8,9,1,2,3,4};
     int k=9;
     System.out.println(search(m, k, 0,m.length-1));
     
    }
    static int search(int arr[],int k,int s,int e)
    {   
        if(s>e)
        {
            return -1;

        }
        int m=s+(e-s)/2;
        if(arr[m]==k)
        {
            return m+1;
        }
        if(arr[s]<=arr[m]){
            if(k>=arr[s] && k<=arr[m])
            {
                return search(arr, k, s, m-1);
            }
            else
                return search(arr, k, m+1, e);
        }
        if(k>=arr[m]&& k<=arr[e])
            return search(arr, k, m+1, e);
        return search(arr, k, s, m-1);
    }
}

