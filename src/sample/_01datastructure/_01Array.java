package sample._01datastructure;

public class _01Array {

    public static void main(String[] args) {

        int[] intArr = new int[10];
        print(intArr);
        int[] intArr2 = {1,2,3,4};
        print(intArr2);
//        for (int i = 0; i < intArr.length; i++) {
//
//        }
    }

    static void print(int[] intArr) {
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
