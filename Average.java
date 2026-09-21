public class Average {
    public static void main(String args[]) {
        int store = 0;
        int arr[] = { 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            store = store + arr[i];
        }
        double n = store / arr.length;
        System.out.println(n);

    }
}