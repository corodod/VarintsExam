package tasks;

import java.util.Scanner;

public class Task_1_1_finish {
    public static String reverse(StringBuilder str) {
        return new StringBuilder(str).reverse().toString();
    }
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilderMajor = new StringBuilder();
        StringBuilder stringBuilderMinorStart = new StringBuilder();
        String stringBuilderMinorEnd;
        String part;
        int index = 1;
        int step = 1;

        int n = scanner.nextInt();
        if(n==0){
            System.out.println();
        }else{
            if(n==1){
                System.out.println(alphabet.charAt(0));
            }else{
                stringBuilderMinorStart.append(alphabet.charAt(0));
                stringBuilderMajor.append(stringBuilderMinorStart);
                for(int i=n;i>0;i-=step){
                    stringBuilderMinorEnd = reverse(stringBuilderMinorStart);
                    part = stringBuilderMinorStart.toString()+alphabet.charAt(index)+stringBuilderMinorEnd;
                    stringBuilderMajor.append(part);
                    stringBuilderMinorStart.append(alphabet.charAt(index));
                    index++;
                    step+=2;
                }
            }
        }

        for (int i=0;i<n;i++){
            System.out.print(stringBuilderMajor.toString().charAt(i));
        }
    }
}
