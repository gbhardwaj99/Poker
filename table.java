public class table {
    public int[] rank(char ch[]) {
        int x[] = new int[5];
        int i, k = 0;
        for (i = 0; i < 5; i++) {
            if (ch[i] == 'A') {
                x[k] = 13;
                k++;
            } else if (ch[i] == 'K') {
                x[k] = 12;
                k++;
            } else if (ch[i] == 'Q') {
                x[k] = 11;
                k++;
            } else if (ch[i] == 'J') {
                x[k] = 10;
                k++;
            } else if (ch[i] == '9') {
                x[k] = 9;
                k++;
            } else if (ch[i] == '8') {
                x[k] = 8;
                k++;
            } else if (ch[i] == '7') {
                x[k] = 7;
                k++;
            } else if (ch[i] == '6') {
                x[k] = 6;
                k++;
            } else if (ch[i] == '5') {
                x[k] = 5;
                k++;
            } else if (ch[i] == '4') {
                x[k] = 4;
                k++;
            } else if (ch[i] == '3') {
                x[k] = 3;
                k++;
            } else {
                x[k] = 2;
                k++;
            }

        }
        return x;
    }
}