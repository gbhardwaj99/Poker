public class flush
{
    public boolean flsh(char s[])
    {
        int i,j,c=0;
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(s[i]==s[j])
                    c++;
            }
        }
        if(c==10)
            return true;
        else
            return false;
    }
}
