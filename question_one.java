public class question_one {
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int i = m - n - 1; // Index of the last non-vacant element in X
        int j = n - 1;      // Index of the last element in Y
        
        // Start from the end of X[] and fill vacant cells with elements from Y[]
        int k = m - 1;
        while (j >= 0) {
            // If X[i] is greater than Y[j], swap them
            if (i >= 0 && X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        merge(X, Y);

        System.out.print("Merged array: ");
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
