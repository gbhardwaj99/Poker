public class straight
{
    public boolean st(int x[])
    {
        int i,j,c1=0,c2=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(x[i]-x[j]==1)
                    c1++;
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(x[i]==x[j])
                    c2++;
            }
        }
        if(c1==4 && c2==0)
            return true;
        else
            return false;
    }
}
