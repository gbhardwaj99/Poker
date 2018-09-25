public class test
{
    public static void main(String args[])
    {
        int i,j,c=0;
        int a[] = {1,3,5,2,6};
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(a[i]-a[j]==1)
                    c++;
            }
        }
        if(c==4)
            System.out.println("Consecutive");
        else
            System.out.println("Not Consecutive");
    }
}
