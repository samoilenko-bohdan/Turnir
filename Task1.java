package week2;

import java.util.Scanner;
import java.io.*;
class Task1 {
    public static void main(String[] argv) throws IOException {
        Task1 solution = new Task1();
        solution.run();
    }
    Scanner sc;
    PrintWriter pw;

    public void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        double num = sc.nextDouble();
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        if (num > 0) {
            num = Math.pow(num, 2.0);
        } else if (num < 0) {
            num = Math.abs(num);
        } else {
            num = 0;
        }
        pw.println((int) num);
        pw.close();
        }

    }

