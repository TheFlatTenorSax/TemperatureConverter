import java.util.*;
public class TemperatureConverter {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Scanner convert = new Scanner(System.in);
    Scanner restarting = new Scanner(System.in);
    boolean Restart = true;

    while(Restart){
        System.out.println("This is a temperature converter.");
        System.out.println("Input '1' for Fahrenheit to Celsius. Input '2' for Celsius to Fahrenheit.");
        int TypeInput = sc.nextInt();

    if(TypeInput == 1){
        System.out.println("Input a temperature in Fahrenheit.");
        int FahTemp = convert.nextInt();
        int FahtoCel1 = FahTemp - 32;
        double FahtoCel = FahtoCel1 / 1.8;
        System.out.println(FahTemp + "F" + "--->" + FahtoCel + "C");
    }else if(TypeInput == 2){
        System.out.println("Input a temperature in Celcius");
        int CelTemp = convert.nextInt();
        double CeltoFah1 = CelTemp * 1.8;
        double CeltoFah = CeltoFah1 + 32;
        System.out.println(CelTemp + "C" + "--->" + CeltoFah + "F");
    }else{
        System.out.println("Invalid input.");
    }

    System.out.println("Convert again?");
    String keepGoing = restarting.nextLine();

    if(keepGoing.equals("Yes")){
        System.out.println("Restarting...");
        Restart = true;
    }else if(keepGoing.equals("No")){
        System.out.println("Terminating program (Goodbye...)");
        Restart = false;
    }else if(keepGoing.equals("yes")){
        System.out.println("Restarting...");
        Restart = true;
    }else if(keepGoing.equals("no")){
        System.out.println("Terminating program (Goodbye...)");
        Restart = false;
    }

}
    restarting.close();
    sc.close();
    convert.close();

    }


    }

