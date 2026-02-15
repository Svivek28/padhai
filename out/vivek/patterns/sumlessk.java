package out.vivek.patterns;
/*Input: arr[] = {1, 2, 1, 0, 1, 1, 0}, k = 4
Output: 5
Explanation: {1, 2, 1} => sum = 4, length = 3 {1, 2, 1, 0}, {2, 1, 0, 1} => sum = 4, length = 4 {1, 0, 1, 1, 0} =>5 sum = 3, length = 5

Input: 8, 2, 4, 0, 1, 1, 0, K = 9
Output: 6 */
public class sumlessk {
    public static void main(String[] args) {
        int m[]= {1, 2, 1, 0, 1, 1, 0};
        int k=4;
        int sum=0;
        int left=0;
        int right=m.length-1;
        while(left<=right){
            sum=sum+m[left];
        }
    }
}
