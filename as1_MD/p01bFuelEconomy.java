import java.util.Scanner;
public class p01bFuelEconomy {
  public static void main(String[] args) {
    Scanner po = new Scanner(System.in);
    System.out.println("Enter the number of kilometers:");
    int km = po.nextInt();
    System.out.println("Enter the liters of fuel used:");
    double fuel = po.nextDouble();
    double literPer100km = (fuel/km)*100;
    System.out.println(literPer100km);
  }
}