import java.util.Scanner;
public class p03Angle {
  public static void main(String[] args) {
    Scanner po = new Scanner(System.in);
    System.out.println("Angle 1 (degrees minutes seconds)?");
    int a1deg = po.nextInt();
    int a1min = po.nextInt();
    int a1sec = po.nextInt();
    System.out.println("Angle 2 (degrees minutes seconds)?");
    int a2deg = po.nextInt();
    int a2min = po.nextInt();
    int a2sec = po.nextInt();
    int sec = ((a1sec+a2sec)%60);
    int min = ((a1min+a2min+(a1sec+a2sec)/60)%60);
    int deg = ((a1deg+a2deg+((a1min+a2min+(a1sec+a2sec)/60)/60))%360);
    System.out.println(deg+"\u00B0"+min+"'"+sec+"\"");
  }
}