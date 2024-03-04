package Chess;

import java.util.Scanner;

public class Chess {
  public void chess() {
    Scanner sc = new Scanner(System.in);
    int correct[] = { 1, 1, 2, 2, 2, 8 };
    int chess[] = new int[6];
    for (int i = 0; i < 6; i++) {
      chess[i] = sc.nextInt();
      System.out.print(correct[i] - chess[i] + " ");
    }
    System.out.println("");
    sc.close();

  }
}
