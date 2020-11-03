package fibonacci;

import java.util.Scanner;

public class Rekursion {
    static Scanner reaeder = new Scanner(System.in);
    public static void main(String[] args) {
int n;
        System.out.print("Geben Sie n ein: ");
        n =reaeder.nextInt();
        System.out.println(rekursion(n));


    }

    public static int rekursion(int n){
        if(n == 1) {
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return rekursion(n-1) + rekursion(n-2);
        }
    }
}
