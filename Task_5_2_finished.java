package tasks;

import tasks.utils.ArrayUtils;

import java.util.*;

public class Task_5_2_finished {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        Collection<Integer> values = map.values();
        int sum = 0;
        for(Integer i: values){
            if(i!=1) sum+=i;
        };
        System.out.println(sum);
    }
}
