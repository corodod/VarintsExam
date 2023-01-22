package tasks;

import java.util.Scanner;

public class Task_4_1_finished {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char star = '*';
        char grid = '#';
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                //первая и последняя строки
                if(i==0 || i==(h-1)){
                    if(j==w-1){
                        System.out.println(star);
                    }else System.out.print(star);
                }else{
                    //вторая и предпоследняя
                    if(i==1 || i==h-2){
                        if(j>0 && j<w-1) System.out.print(grid);
                        else if(j==0){
                            System.out.print(star);
                        }else{
                            System.out.println(star);
                        }
                    }else{
                        if(j==0) System.out.print(star);
                        if(j==w-1) System.out.println(star);
                        if(j==1 || j==w-2) System.out.print(grid);
                        if(j>1 && j<w-2) System.out.print(" ");
                    }
                }
            }
        }
    }
}
