package tasks;

import java.util.Scanner;

public class Task_4_2_finished {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char star = '*';
        char horiz = '-';
        char vert = '|';
        char lSlash = '\\';
        char rSlash = '/';
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                //первая и последняя строки
                if(i==0 || i==h-1){
                    if(w==1){
                        System.out.println(star);
                    }else{
                        if(j==0)System.out.print(star);
                        if(j>0 && j<w-1) System.out.print(horiz);
                        if(j==w-1) System.out.println(star);
                    }
                }else{
                    if(w==1){
                        System.out.println(vert);
                    }else{
                        if(j==0) System.out.print(vert);
                        if(j>0 && j<w-1){
                            if(i%2==1){
                                System.out.print(lSlash);
                            }else{
                                System.out.print(rSlash);
                            }
                        }
                        if(j==w-1) System.out.println(vert);
                    }
                }
            }
        }
    }
}
