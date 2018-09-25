import java.util.Scanner;
import java.io.*;
public class poker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        shuffle s = new shuffle();
        suit st = new suit();
        cards c = new cards();
        table t = new table();
        straight_flush stf = new straight_flush();
        four_kind fk = new four_kind();
        flush f = new flush();
        straight sg = new straight();
        three_kind tk = new three_kind();
        pair p = new pair();
        high_card hc = new high_card();
        char n1[] = s.gen_num();
        char n2[] = s.gen_num();
        char ch1[] = st.gen_suit();
        char ch2[] = st.gen_suit();
        String s1 = c.get_card(n1, ch1);
        String s2 = c.get_card(n2, ch2);
        int x = c.check(s1, s2);
        String str1 = c.give(x, s1);
        String str2 = c.give(x, s2);
        int x1[] = t.rank(n1);
        int x2[] = t.rank(n2);
        int i;
        System.out.println("Let's Play Poker");
        System.out.println("Player1 cards");
        System.out.println(str1);
        System.out.println("Player2 cards");
        System.out.println(str2);
        System.out.println();
        if (stf.flush(x1, ch1) == true)
            System.out.println("Player1 Wins\nStraight Flush");
        else if (stf.flush(x2, ch2) == true)
            System.out.println("Player2 Wins\nStraight Flush");
        else {
            if (fk.four(x1)==true)
                System.out.println("Player1 Wins\nFour of a kind");
            else if(fk.four(x2)==true)
                System.out.println("Player2 Wins\nFour of a kind");
            else{
                if(f.flsh(ch1)==true)
                    System.out.println("Player1 Wins\nFlush");
                else if(f.flsh(ch2)==true)
                    System.out.println("Player2 Wins\nFlush");
                else{
                    if(sg.st(x1)==true)
                        System.out.println("Player1 Wins\nStraight");
                    else if(sg.st(x2)==true)
                        System.out.println("Player2 Wins\nStraight");
                    else{
                        if(tk.three(x1)==true)
                            System.out.println("Player1 Wins\nThree of a kind");
                        else if(tk.three(x2)==true)
                            System.out.println("Player2 Wins\n Three of a kind");
                        else{
                            if(p.pr(x1)==true)
                                System.out.println("Player1 Wins\nPair");
                            else if(p.pr(x2)==true)
                                System.out.println("Player2 Wins\nPair");
                            else{
                                if(hc.high(x1,x2)==true)
                                    System.out.println("Player2 Wins\nHigh Card");
                                else
                                    System.out.println("Player1 Wins\nHigh Card");
                            }
                        }
                    }
                }
            }
        }

    }
}