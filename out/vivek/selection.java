package out.vivek;
public class selection {
    public static void main(String[] args) {
        int m[]={2,1,5,3,7};
        for(int i=0;i<5;i++)
        {
            int min=m[i];
            for(int j=i+1;j<5;j++)
            {
                if(m[j]<m[i])
                {
                    int temp=min;
                    m[i]=m[j];
                    m[j]=temp;
                }
            }
        }
        for(int x:m)
        {
            System.out.println(x);
        }
    }
}
