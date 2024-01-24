import java.util.Scanner;
public class p01aFuelEconomy {
  public static void main(String[] args) {
    Scanner po = new Scanner(System.in);
    int miles;
    double gallons, mpg;
    System.out.println("How many miles did you travel?");
    miles = po.nextInt();
    System.out.println("How many gallons of gas did you use?");
    gallons = po.nextDouble();
    mpg = miles/gallons;
    System.out.println(mpg);
  }
}