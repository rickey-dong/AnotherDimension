public class Tester
{
  public static void main(String[] args)
  {
    int[] a = {3, 5, 7, 6, 4};
    System.out.println(ArrayOps.sum(a) + " should be 25");
    int[] b = {2, 7, 0, 4};
    System.out.println(ArrayOps.sum(b) + " should be 13");
    int[] c = {};
    System.out.println(ArrayOps.sum(c) + " should be 0");
  }
}
