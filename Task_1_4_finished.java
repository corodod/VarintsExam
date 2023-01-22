package tasks;

import java.util.Scanner;

public class Task_1_4_finished {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int length = 0;
        int index = 0;
        int k = 0;
        StringBuilder stringBuilder = new StringBuilder();

        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            switch (c) {
                case 0 -> {
                    System.out.print("(");
                    stringBuilder=new StringBuilder(alphabet.charAt(index)+stringBuilder.toString());
                    index++;
                    length = stringBuilder.length();
                    c++;
                }
                case 1 -> {
                    if (k < length) {
                        System.out.print(stringBuilder.toString().charAt(k));
                        k++;
                    } else {
                        k=0;
                        System.out.print(")");
                        c = 0;
                    }
                }
            }
        }
    }
}
