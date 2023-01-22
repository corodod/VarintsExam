package tasks;

import tasks.utils.ArrayUtils;

public class Task_6_5_finish {
    public static int findMax(int[][] data){
        int max = -1000000;
        for(int j=0;j<data[0].length;j++){
            for(int i=0;i<data.length;i++){
                if(data[i][j]>max){
                    max=data[i][j];
                }
            }
        }
        return max;
    }

    public static int findMin(int[][] data){
        int min = 1000000;
        for(int j=0;j<data[0].length;j++){
            for(int i=0;i<data.length;i++){
                if(data[i][j]<min){
                    min=data[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] data = ArrayUtils.readIntArray2FromConsole();

    }
}
