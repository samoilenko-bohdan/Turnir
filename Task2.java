package week2;

import java.util.Scanner;
import java.io.*;
class Task2 {
    public static void main(String[] argv) throws IOException {
        run();
    }
    static Scanner sc;
    static PrintWriter pw;

    public static void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        double num = sc.nextDouble();
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        if (num % 2 == 0) {
            num = Math.pow(num, 2.0);
        } else {
            num = num - 1;
        }
        pw.println((int) num);
        pw.close();
    }

}
