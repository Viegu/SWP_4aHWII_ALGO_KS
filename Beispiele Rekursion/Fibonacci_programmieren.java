package fibonacci;

public class Fibonacci_programmieren {
    public static void main(String[] args) {
        int f1 = 0, f2=1,fib;
        System.out.println(f2);
        for(int i = 0 ; i <30;i++){
            fib = f1+f2;
            System.out.println(fib);
            f1 = f2;
            f2 =fib;
        }


    }



}
