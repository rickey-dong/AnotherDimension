public class ArrayOps
{
  public static int sum(int[] arr)
  {
    int total = 0;
    for (int number = 0; number < arr.length; number++)
    {
      total = total + arr[number];
    }
    return total;
  }
  public static int largest(int[] arr)
  {
    int biggest = arr[0];
    for (int number = 1; number < arr.length; number++)
    {
      if (arr[number] > biggest)
      {
        biggest = arr[number];
      }
    }
    return biggest;
  }
  public static int[] sumRows(int[][] matrix)
  {
    int[] sumOfTheRows = new int[matrix.length];
    for (int subarray = 0; subarray < matrix.length; subarray++)
    {
      sumOfTheRows[subarray] = sum(matrix[subarray]);
    }
    return sumOfTheRows;
  }
  public static int[] largestInRows(int[][] matrix)
  {
    int[] biggestOfTheRows = new int[matrix.length];
    for (int subarray = 0; subarray < matrix.length; subarray++)
    {
      biggestOfTheRows[subarray] = largest(matrix[subarray]);
    }
    return biggestOfTheRows;
  }
  public static int sum(int[][] arr)
  {
    int totalSum = 0;
    int[] rowSum = sumRows(arr);
    for (int number = 0; number < arr.length; number++)
    {
      totalSum = totalSum + rowSum[number];
    }
    return totalSum;
  }
  public static int[] sumCols(int[][] matrix)
  {
    int[] sumOfTheColumns = new int[(matrix[0]).length];
    for (int column = 0; column < matrix[0].length; column++)
    {
      int tempSum = 0;
      for (int subarray = 0; subarray < matrix.length; subarray++)
      {
        tempSum = tempSum + (matrix[subarray])[column];
        sumOfTheColumns[column] = tempSum;
      }
    }
    return sumOfTheColumns;
  }
  public static boolean isRowMagic(int[][] matrix)
  {
    int[] allOfTheRows = sumRows(matrix);
    for (int number = 1; number < allOfTheRows.length; number++)
    {
      if (allOfTheRows[number] != allOfTheRows[number - 1])
      {
        return false;
      }
    }
    return true;
  }
  /*public static boolean isColMagic(int[][] matrix)
  {

  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col)
  {

  }*/
}
