import java.util.Arrays;

public class Tester
{
  public static void main(String[] args)
  {
    System.out.println("------------------------------------");
    System.out.println("Sum of An Array:");
    int[] konstanB = {1, 3, 5};
    System.out.println(ArrayOps.sum(konstanB) + " should be 9");
    int[] suma = {3, 5, 7, 6, 4};
    System.out.println(ArrayOps.sum(suma) + " should be 25");
    int[] sumb = {2, 7, 0, 4};
    System.out.println(ArrayOps.sum(sumb) + " should be 13");
    int[] sumc = {};
    System.out.println(ArrayOps.sum(sumc) + " should be 0");
    System.out.println("------------------------------------");
    System.out.println("Largest Value of An Array:");
    int[] largesta = {7, 4, 3, 5, 2, 1};
    System.out.println(ArrayOps.largest(largesta) + " should be 7");
    int[] largestb = {0, 0, 5, 9, 3, -1};
    System.out.println(ArrayOps.largest(largestb) + " should be 9");
    int[] largestc = {3, 4, 6, 8, 13, 20};
    System.out.println(ArrayOps.largest(largestc) + " should be 20");
    System.out.println("------------------------------------");
    System.out.println("Sum of Each Row of A 2D Array:");
    int[][] konstanA = { {1, 0, 12, -1}, {7, -2, 2, 1}, {-5, -2, 2, -9} };
    System.out.println(Arrays.toString(ArrayOps.sumRows(konstanA)) + " should be [12, 8, -14]");
    int[][] sumrowsA = { {3, 4, 6, 7}, {4, 2, 10, -20}, {0, 0, 0, 5}};
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumrowsA)) + " should be [20, -4, 5]");
    int[][] sumrowsB = { {}, {}, {5, 3, 2, 5}};
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumrowsB)) + " should be [0, 0, 15]");
    int[][] sumrowsC = {};
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumrowsC)) + " should be []");
    System.out.println("------------------------------------");
    System.out.println("Largest Value of Each Row of a 2D Array:");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(konstanA)) + " should be [12, 7, 2]");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(sumrowsA)) + " should be [7, 10, 5]");
    int[][] largest2D = { {4, 5, 6, 2,}, {10, 30, 50, -20}, {10, 23, 6, 8}};
    System.out.println(Arrays.toString(ArrayOps.largestInRows(largest2D)) + " should be [6, 50, 23]");
    System.out.println("------------------------------------");
    System.out.println("Sum of All the Elements in a 2D Array:");
    System.out.println(ArrayOps.sum(konstanA) + " should be 6");
    System.out.println(ArrayOps.sum(sumrowsA) + " should be 21");
    System.out.println(ArrayOps.sum(sumrowsB) + " should be 15");
    System.out.println(ArrayOps.sum(sumrowsC) + " should be 0");
    System.out.println(ArrayOps.sum(largest2D) + " should be 134");
    System.out.println("------------------------------------");
    System.out.println("Sum of the Columns of a 2D Array:");
    System.out.println(Arrays.toString(ArrayOps.sumCols(konstanA)) + " should be [3, -4, 16, -9]");
    System.out.println(Arrays.toString(ArrayOps.sumCols(sumrowsA)) + " should be [7, 6, 16, -8]");
    System.out.println(Arrays.toString(ArrayOps.sumCols(largest2D)) + " should be [24, 58, 62, -10]");
    int[][] testSumCol = { {}, {}, {} };
    System.out.println(Arrays.toString(ArrayOps.sumCols(testSumCol)) + " should be []");
    int[][] testSumColA = { {} };
    System.out.println(Arrays.toString(ArrayOps.sumCols(testSumColA)) + " should be []");
    System.out.println("------------------------------------");
    System.out.println("Are the Sums of Each Row Equal?:");
    int[][] thisisRowMagic = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2} };
    System.out.println(ArrayOps.isRowMagic(thisisRowMagic) + " should be true");
    int[][] thisisColMagic = { {1,1,1}, {2,2,2}, {3,3,3}};
    System.out.println(ArrayOps.isRowMagic(thisisColMagic) + " should be false");
    int[][] thisisBoth = { {2,2,2}, {2,2,2} };
    System.out.println(ArrayOps.isRowMagic(thisisBoth) + " should be true");
    System.out.println(ArrayOps.isRowMagic(sumrowsA) + " should be false");
    System.out.println("------------------------------------");
    System.out.println("Are the Sums of Each Column Equal?:");
    System.out.println(ArrayOps.isColMagic(thisisRowMagic) + " should be false");
    System.out.println(ArrayOps.isColMagic(thisisColMagic) + " should be true");
    System.out.println(ArrayOps.isColMagic(thisisBoth) + " should be true");
    System.out.println(ArrayOps.isColMagic(sumrowsA) + " should be false");
  }
}
