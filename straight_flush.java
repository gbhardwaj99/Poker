import java.io.*;
public class straight_flush
{
    public boolean flush(int n[],char s[])
    {
        int i,j,c1=0,c2=0,c3=0;
        for(i=0;i<5;i++)
        {
           for(j=0;j<5;j++)
           {
               if(n[i]-n[j]==1)
                   c1++;
           }
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(n[i]==n[j])
                    c3++;
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(s[i]==s[j])
                    c2++;
            }
        }
        if(c1==4 && c2==10 && c3==0)
            return true;
        else
            return false;
    }
}
