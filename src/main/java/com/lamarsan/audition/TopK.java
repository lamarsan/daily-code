package com.lamarsan.audition;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName K
 * @Description TODO
 * @Author Lamar
 * @Date 2020/6/7 下午3:16
 **/
public class TopK {
    static Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        System.out.println(theTop20(arr));
    }

    private static Integer theTop20(int[] arr) {
        for (int i : arr) {
            if (priorityQueue.size() < 20) {
                priorityQueue.add(i);
            } else if (i < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(i);
            }
        }
        return priorityQueue.peek();
    }
}
