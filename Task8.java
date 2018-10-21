package week2;

import java.util.Scanner;
import java.io.*;
class Task8 {
    public static void main(String[] argv) throws IOException {
        run();
    }
    static Scanner sc;
    static PrintWriter pw;

    public static void run() throws IOException {
        sc = new Scanner(new File("D:\\Java\\src\\week2\\input.txt"));
        int num = sc.nextInt();
        pw = new PrintWriter(new File("D:\\Java\\src\\week2\\output.txt"));
        int first = num / 1000;
        int second = num / 100 % 10;
        int third = num % 100 / 10;
        int forth = num % 10;
        int[] array = {first, second, third, forth};
        int[] sortArray = sort(array);
        int range = 1000;
        int answer = 0;
        for (int x : sortArray){
            int res = x * range;
            answer += res;
            range /= 10;
        }
        pw.print(answer);
        pw.close();
    }
    public static int[] sort(int[] array){
        int len = 4;
        for(int bypass = 1; bypass < len; bypass++) {
            for(int i = 0; i < len - bypass; i++){
                if(array[i + 1] < array[i]){
                    array[i + 1] = array[i + 1] ^ array[i];
                    array[i] = array[i + 1] ^ array[i];
                    array[i + 1] = array[i + 1] ^ array[i];
                }
            }
        }
        return array;
    }

}

