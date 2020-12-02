import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {

public static int Schritte;
    public static ArrayList<Integer> numbers= new ArrayList<>();



    public static void main(String[] args) {




        fillArray(numbers);
        long millisstart = System.currentTimeMillis();
        bubbleSort(numbers);
        long millisend = System.currentTimeMillis();
        //System.out.println(numbers);
        System.out.println("Der Bubble-Sort vorgang hat: "+ (millisend-millisstart) + " Millisekunden gebraucht!");
        System.out.println("Der Bubble-Sort vorgang hat: "+ ((millisend-millisstart)/1000) + " Sekunden gebraucht!");
        System.out.println(Schritte + " Schritte waren Notwendig");
    }

    public static void fillArray(ArrayList<Integer> numbers){
        Random rnd = new Random();
        for(int x=0;x<1000;x++){
            numbers.add(rnd.nextInt());
        }


    }
    public static void bubbleSort(ArrayList<Integer> numbers){
        int zwischenspeicher;
        int size = numbers.size();
        for(int x = 0; x<size;x++){
            for(int i =0; i<(size-x-1);i++){
                if(numbers.get(i)> numbers.get(i+1)){
                    zwischenspeicher = numbers.get(i);
                    numbers.set(i,numbers.get(i+1));
                    numbers.set(i+1,zwischenspeicher);
                    Schritte++;
                }
            }
        }
    }
}
