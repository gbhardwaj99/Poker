public class high_card
{
    public boolean high(int x1[],int x2[])
    {
        int i,j=0,max1=0,max2=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(x1[j]>max1)
                    max1 = x1[j];
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(x2[j]>max2)
                    max2 = x2[j];
            }
        }
        if(max2>max1)
            return true;
        else
            return false;
    }
}
