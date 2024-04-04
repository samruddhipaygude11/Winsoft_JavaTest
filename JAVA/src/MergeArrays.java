public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int lastIndex = m - 1;
        while (lastIndex >= 0 && X[lastIndex] == 0)
            lastIndex--;

        int i = lastIndex;
        int j = n - 1;
        int k = m - 1;

        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k] = X[i];
                i--;
            } else {
                X[k] = Y[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            X[k] = Y[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        System.out.print("Merged array: ");
        for (int num : X) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
