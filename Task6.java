package week2;

import java.util.Scanner;
import java.io.*;
class Task6 {
    public static void main(String[] argv) throws IOException {
        run();
    }
    static Scanner sc;
    static PrintWriter pw;

    public static void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        int n = sc.nextInt();
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        int xl = Math.max(x1, x2) - Math.min(x1, x2);
        int yl = Math.max(y1, y2) - Math.min(y1, y2);
        int res;
        if (xl > yl) {
            xl = xl - 1;
           res = Math.max(xl, yl) + 1;
        } else if (xl < yl){
            yl = yl - 1;
            res = Math.max(xl, yl) + 1;
        } else {
            res = xl;
        }
        pw.print(res);
        pw.close();
        }

    }

