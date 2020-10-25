public class Tester
{
  public static void main(String[] args)
  {
    int[] suma = {3, 5, 7, 6, 4};
    System.out.println(ArrayOps.sum(suma) + " should be 25");
    int[] sumb = {2, 7, 0, 4};
    System.out.println(ArrayOps.sum(sumb) + " should be 13");
    int[] sumc = {};
    System.out.println(ArrayOps.sum(sumc) + " should be 0");
    System.out.println("------------------------------------");
    int[] largesta = {7, 4, 3, 5, 2, 1};
    System.out.println(ArrayOps.largest(largesta) + " should be 7");
    int[] largestb = {0, 0, 5, 9, 3, -1};
    System.out.println(ArrayOps.largest(largestb) + " should be 9");
    int[] largestc = {3, 4, 6, 8, 13, 20};
    System.out.println(ArrayOps.largest(largestc) + " should be 20");
  }
}
