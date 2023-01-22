package tasks;

import tasks.utils.ArrayUtils;

public class Task_5_5_finished {
    public static boolean checkLocalMax(int l, int c, int r){
        if(l==-1) return r>c;
        if(r==-1) return l>c;
        return c>l && c>r;
    }

    public static void main(String[] args) {
        int max = -100000;
        int index = -1;
        boolean flag = false;
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        if(arr.length==1) System.out.println(index);
        else{
            for(int i=0;i< arr.length;i++){
                if(i==0){
                    if(checkLocalMax(arr[i],arr[i+1],-1)){
                        max = arr[i];
                        index = 0;
                        flag = true;
                    }
                }else if(i==arr.length-1){
                    if(checkLocalMax(-1,arr[i-1],arr[i])){
                        if(!flag){
                            max=arr[i];
                            index=i;
                        }else{
                            if(arr[i]<max){
                                max=arr[i];
                                index=i;
                            }
                        };
                    }
                }else{
                    if(checkLocalMax(arr[i-1],arr[i],arr[i+1])){
                        if(!flag){
                            max=arr[i];
                            index=i;
                            flag = true;
                        }else{
                            if(arr[i]<max){
                                max=arr[i];
                                index=i;
                            }
                        };
                    }
                }
            }
            System.out.println(index);
        }
    }
}
