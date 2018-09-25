import java.util.Random;
import java.io.*;
public class shuffle
{
    public char[] gen_num()
    {
        Random rand = new Random();
        char ch[] = new char[5];
        int i,n;
        for(i=0;i<5;i++)
        {
            n = rand.nextInt(12) + 2;
            if(n==10)
                ch[i] = 'A';
            else if(n==11)
                ch[i] = 'K';
            else if(n==12)
                ch[i] = 'Q';
            else if(n==13)
                ch[i] = 'J';
            else
                ch[i] = (char)(n + '0');
        }
        return ch;
    }
}
