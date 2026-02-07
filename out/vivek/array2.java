package out.vivek;

/*Input:
 nums = [1, 2, 3, 4, 5]  
Output:
 [2, 3, 4, 5, 1]  
Explanation:
 Initially, nums = [1, 2, 3, 4, 5]  
Rotating once to the left results in nums = [2, 3, 4, 5, 1].

Example 2:
Input:
 nums = [-1, 0, 3, 6]  
Output:
 [0, 3, 6, -1]  */
 class array2
 {
    public static void main(String[] args) {
        int m[]={1, 2, 3, 4, 5};
        int n=m[0];
        for(int i=0;i<m.length-1;i++)
        {
            m[i]=m[i+1];
        }
        m[m.length-1]=n;
    
    for(int i=0;i<m.length;i++)
        {
            System.out.print(m[i]+"-->");
 }
}
 }
