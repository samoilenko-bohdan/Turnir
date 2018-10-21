package week2;

import java.util.Scanner;
import java.io.*;
class Task5 {
    public static void main(String[] argv) throws IOException {
        run();
    }
    static Scanner sc;
    static PrintWriter pw;

    public static void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        int L = Math.max(Math.min(x1,x2), Math.min(x3,x4));
        int R = Math.min(Math.max(x1,x2),Math.max(x3,x4));
        int T = Math.min(Math.max(y1,y2),Math.max(y3,y4));
        int B = Math.max(Math.min(y1,y2),Math.min(y3,y4));
        if (R - L > 0 && T - B > 0) {
            pw.print((R-L) * (T-B));
        } else {
            pw.print(0);
        }
        pw.close();
    }

}
