package week2;

import java.util.Scanner;
import java.io.*;
class Task10 {
    public static void main(String[] argv) throws IOException {
        run();
    }
    static Scanner sc;
    static PrintWriter pw;

    public static void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        int num = sc.nextInt();
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        int area = num / 2;
        if (area % 2 == 0){
            area = (area / 2) * (area / 2);
        } else {
            area = (area / 2) * ((area / 2) + 1);
        }

        pw.print(area);
        pw.close();
    }

}

