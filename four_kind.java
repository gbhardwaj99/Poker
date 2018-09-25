public class four_kind
{
    public boolean four(int x[])
    {
        int c=0,i,j;
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {   if(x[i]==x[i])
                    c++;
            }
        }
        if(c==6)
            return true;
        else
            return false;
    }
}
