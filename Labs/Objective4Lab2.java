import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner Keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    String pleaseEnter = "Please enter the ";
    String numberYou = "number you would like to add.";

    System.out.println(pleaseEnter + "first whole " + numberYou);
    num1 = Keyboard.nextInt();
    System.out.println(pleaseEnter + "second whole " + numberYou);
    num2 = Keyboard.nextInt();
    System.out.println(pleaseEnter + "third whole " + numberYou);
    num3 = Keyboard.nextInt();
    System.out.println(pleaseEnter + "first decimal " + numberYou);
    dub1 = Keyboard.nextDouble();
    System.out.println(pleaseEnter + "second decimal " + numberYou);
    dub2 = Keyboard.nextDouble();
    System.out.println(pleaseEnter + "third decimal " + numberYou);
    dub3 = Keyboard.nextDouble();

    int numSum = num1 + num2 + num3;
    double dubSum = dub1 + dub2 + dub3;

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 +
                        " = " + numSum);
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 +
                        " = " + dubSum);
    Keyboard.close();
  }
}
