import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Scanner;
public class p02Donut {
  public static void main(String[] args) {
    Scanner po = new Scanner(in);
    out.println("Major radius (cm)?");
    double majR = po.nextDouble();
    out.println("Minor radius (cm)?");
    double minR = po.nextDouble();
    double surArea = (2*PI*majR)*(2*PI*minR);
    double volume = (PI*pow(minR,2))*(2*PI*majR);
    out.println("Torus volume is: "+volume+" cm^3");
    out.println("Torus surface area is: "+surArea+" cm^2");
  }
}