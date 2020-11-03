package fibonacci;

import java.util.Scanner;

public class Hochzahlrekursion {
static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double zahl;
        int hochzahl;
        System.out.print("Geben Sie eine Zahl ein:");
        zahl = reader.nextDouble();

        System.out.print("Geben Sie die Hochzahl für "+ zahl + " ein: ");
        hochzahl = reader.nextInt();

        System.out.println(zahl+ "^"+ hochzahl + " ergibt: "+ potenzrekursion(zahl,hochzahl));



    }

    public static double potenzrekursion(double zahl, int hochzahl){
        if(hochzahl==1){
            return zahl;
        }else{
            return zahl * potenzrekursion(zahl,(hochzahl-1));
        }
    }
}
