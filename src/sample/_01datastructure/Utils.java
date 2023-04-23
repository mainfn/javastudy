package sample._01datastructure;

import java.util.Collection;

public class Utils {
    public static void print(Collection arr) {
        for (Object i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
