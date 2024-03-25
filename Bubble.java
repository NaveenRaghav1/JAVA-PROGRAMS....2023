public class Bubble {
    static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hello friends this is a simple program of bubble sorting using loops date-13/03/24");
        int a[] = { 1, 5, 45, 7, 8, 9, 1, 0, 45 };
        sort(a);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

}