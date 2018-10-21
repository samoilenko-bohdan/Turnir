package week2;

import java.util.Scanner;
import java.io.*;
class Task7 {
    public static void main(String[] argv) throws IOException {
        run();
    }

    static Scanner sc;
    static PrintWriter pw;

    public static void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        int N = sc.nextInt(), K = sc.nextInt();
        int legsOfBugs = N / (K + 1);
        int legsOfSpiders = N - legsOfBugs;
        int spiders = legsOfSpiders / 8;
        int bugs = legsOfBugs / 6;
        pw.print(spiders + bugs);
        pw.close();
    }

}

