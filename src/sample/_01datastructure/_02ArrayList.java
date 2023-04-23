package sample._01datastructure;

import java.util.ArrayList;

public class _02ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        Utils.print(arr1);

        arr1.set(0, 3);
        arr1.add(1, 4);
        Utils.print(arr1);

        

        System.out.println("arr1[0] = " + arr1.get(0));

        System.out.println("arr1.remove(arr1.size() -1) = " + arr1.remove(arr1.size() -1));

        Utils.print(arr1);
    }
}
