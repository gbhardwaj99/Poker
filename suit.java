import java.util.Random;
public class suit
{
    public char[] gen_suit()
    {
        Random rand = new Random();
        int i,k=0;
        char ch[] = new char[5];
        int a[] = new int[5];
        for(i=0;i<5;i++)
            a[i] = rand.nextInt(4) + 11;
        for(i=0;i<5;i++)
        {
            if(a[i]==11)
                ch[k] = 'H';
            if(a[i]==12)
                ch[k] = 'C';
            if(a[i]==13)
                ch[k] = 'S';
            if(a[i]==14)
                ch[k] = 'D';
            k++;
        }
        return ch;
    }
}
