public class three_kind
{
    public boolean three(int x[])
    {
        int i,j,c=0;
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(x[i]==x[j])
                    c++;
            }
        }
        if(c==3)
            return true;
        else
            return false;
    }
}
