public class MaximumSumPath {
    public static int maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Initialize variables to store the sum and maxSum
        int sumX = 0, sumY = 0, maxSum = 0;

        // Initialize pointers for both arrays
        int i = 0, j = 0;

        // Traverse both arrays until reaching the end of either array
        while (i < m && j < n) {
            // If current elements are equal (common element found)
            if (X[i] == Y[j]) {
                // Add the maximum of sumX and sumY to maxSum
                maxSum += Math.max(sumX, sumY);
                // Add the common element to maxSum
                maxSum += X[i];
                // Reset sumX and sumY
                sumX = 0;
                sumY = 0;
                // Move both pointers to the next element
                i++;
                j++;
            } else if (X[i] < Y[j]) {
                // If current element of X is smaller, add it to sumX
                sumX += X[i++];
            } else {
                // If current element of Y is smaller, add it to sumY
                sumY += Y[j++];
            }
        }

        // Add remaining elements of X, if any
        while (i < m) {
            sumX += X[i++];
        }

        // Add remaining elements of Y, if any
        while (j < n) {
            sumY += Y[j++];
        }

        // Add the maximum of remaining sums to maxSum
        maxSum += Math.max(sumX, sumY);

        return maxSum;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        System.out.println("The maximum sum path is: " + maxSumPath(X, Y));
    }
}

