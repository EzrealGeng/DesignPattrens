package fun.gengyun.strategy.comparable;

public class Sorter {

    public static void sort(Comparable[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) < 0 ? j :minPos;

            }
            swap(arr, i ,minPos);
        }

    }

    public static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
