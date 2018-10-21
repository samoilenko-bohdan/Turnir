package week2;

import java.util.Scanner;
import java.io.*;
class Task3 {
    public static void main(String[] argv) throws IOException {
        run();
    }
    static Scanner sc;
    static PrintWriter pw;

    public static void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        double num = sc.nextDouble();
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        if (num % 2 == 0 && num > 0) {
            pw.println("YES");
            pw.println((int) num + 2);
        } else if (num % 2 == 1 && num > 0) {
            num = num + 1;
            pw.println("NO");
            pw.println((int) num);
        } else {
            pw.println("NO");
            pw.println(2);
        }
        pw.close();
    }

}
