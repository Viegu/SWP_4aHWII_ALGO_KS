import java.util.Scanner;

public class Fibu_Endrekursiv {
public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Geben Sie x ein: ");
        int x = reader.nextInt();
        System.out.println(fibEnd1(x));



    }


    public static int fibEnd1(int x){
       return fibEnd2(x-1,1,0);
    }

    public static int fibEnd2(int x, int f1, int f2){
        if(x<=1){
            return f1+f2;
        }else{
            return fibEnd2(x-1,f1+f2,f1);
        }

    }


}
