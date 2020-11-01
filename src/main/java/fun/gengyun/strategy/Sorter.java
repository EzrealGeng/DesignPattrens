package fun.gengyun.strategy;

import fun.gengyun.strategy.comparable.Comparable;

public class Sorter<T> {

    public void sort(T[] arr, Strategy<T> strategy) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                minPos = strategy.compare(arr[minPos], arr[j]) < 0 ? minPos : j;

            }
            swap(arr, i ,minPos);
        }

    }

    public void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
