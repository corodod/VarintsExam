package tasks;

import java.util.Scanner;

public class Task_1_2_finished {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder pattern = new StringBuilder("abcd");
        StringBuilder answer = new StringBuilder(pattern);
        int n = scanner.nextInt();
        int k = 0;
        if(n%4==0){
            k=n/4;
        }else{
            k=n/4+1;
        }
        for(int i=1;i<k;i++){
            char c = pattern.charAt(0);
            pattern = new StringBuilder(pattern.substring(1));
            pattern.append(c);
            answer.append(pattern);
        }
        for(int i=0;i<n;i++){
            System.out.print(answer.toString().charAt(i));
        }
    }
}
