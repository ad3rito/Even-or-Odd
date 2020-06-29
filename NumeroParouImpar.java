import java.util.Scanner;
public class NumeroParouImpar {
    public static void main(String[] argss){
    int x;

    System.out.println("Introduza um numero e nos verificamos se este par ou impar");
    Scanner in = new Scanner(System.in);
    x = in.nextInt();

    if (x % 2 == 0)
      System.out.println("O numero que introduziu e par.");
    else
      System.out.println("O numero que introduziu e impar.");
  }
}