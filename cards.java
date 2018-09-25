import java.io.*;
public class cards
{
    public String get_card(char a[],char b[])
    {
        int i,j,k=0,c=0;
        String str="";
        String str1[] = new String[5];
        for(i=0;i<5;i++)
        {
            str = str + a[i] + b[i] + " ";
        }
        for(i=0;i<14;i=i+3) {
            str1[k] = str.substring(i, i + 2);
            k++;
        }
        for(i=0;i<5;i++)
        {   for(j=i+1;j<5;j++) {
            if (str1[i].equals(str1[j]))
                c++;
            }
        }
        if(c>=1) {
            return "Duplicate Cards";
        }
        else
            return str;
    }
    public int check(String str1,String str2)
    {
       String str3,str4;
       int i,j,x=0;
       System.out.println("*************");
       for(i=0;i<14;i=i+3)
       {
           str3 = str1.substring(i,i+2);
           for(j=i+3;j<14;j=j+3) {
               str4 = str2.substring(j, j + 2);
               if (str3.equals(str4)) {
                   x = 20;
                   break;
               }
               else
                   x = 1;
           }
       }
       System.out.println();
       return x;
    }
    public String give(int x,String str)
    {
        if(x==1)
            return str;
        else
            return "Duplicate. Play Again";
    }
}
