package com.tt.example;

/**
 * 冒泡排序，基础版本
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("Original Array:");
        printArray(array);

        // 使用冒泡排序对数组进行排序
        bubbleSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // 冒泡排序算法
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // 如果当前元素大于下一个元素，交换它们
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 打印数组元素
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // 输出换行，使结果更清晰
    }
}
