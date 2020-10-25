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
  /*public static int[] sumRows(int[][] matrix)
  {

  }
  public static int[] largestInRows(int[][] matrix)
  {

  }
  public static int sum(int[][] arr)
  {

  }
  public static int[] sumCols(int[][] matrix)
  {

  }
  public static boolean isRowMagic(int[][] matrix)
  {

  }
  public static boolean isColMagic(int[][] matrix)
  {

  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col)
  {

  }*/
}
