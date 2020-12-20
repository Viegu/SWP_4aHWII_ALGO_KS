import java.util.Random;
import java.util.Scanner;

public class Sorting {

public static Scanner reader = new Scanner(System.in);
    public static int zahlen = 0;
    static int[] arrayAu;
    static int[] arrayAb;
    static int[] temparray;
    static int[] lottoArray;
    static int SchritteBubbleSort;
    public static void main(String[] args) {
        long startZeit;
        long stopzeit;
        int zahlen;
        System.out.print("Wie viele Zahlen sollen die Arrays haben: ");
        zahlen = reader.nextInt();


//BubbleSort
        System.out.println("BubbleSort:");
       getArrays(zahlen);

        startZeit = System.nanoTime();
       bubbleSort(arrayAu);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Aufsteigenden Array: " +(stopzeit-startZeit)+  " Nanosekunden");

        startZeit = System.nanoTime();
        bubbleSort(arrayAb);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Absteigenden Array: " +(stopzeit-startZeit)+  " Nanosekunden");

        startZeit = System.nanoTime();
        bubbleSort(lottoArray);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Zufälligen Array: " +(stopzeit-startZeit)+ " Nanosekunden");

        System.out.println("");
        System.out.println("");

        //Insertionsort

        System.out.println("Insertionsort:");
getArrays(zahlen);
        startZeit = System.nanoTime();
        insertionSort(arrayAu);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Aufsteigenden Array: " +(stopzeit-startZeit)+  " Nanosekunden");

        startZeit = System.nanoTime();
        insertionSort(arrayAb);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Absteigenden Array: " +(stopzeit-startZeit)+  " Nanosekunden");

        startZeit = System.nanoTime();
        insertionSort(lottoArray);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Zufälligen Array: " +(stopzeit-startZeit)+ " Nanosekunden");
        System.out.println("");
        System.out.println("");
        //Insertionsort binary
        System.out.println("binary Insertionsort:");
        getArrays(zahlen);
        System.out.println("Insertionsort:");
        getArrays(zahlen);
        startZeit = System.nanoTime();
        InsertionSortb(arrayAu);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Aufsteigenden Array: " +(stopzeit-startZeit)+  " Nanosekunden");

        startZeit = System.nanoTime();
        InsertionSortb(arrayAb);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Absteigenden Array: " +(stopzeit-startZeit)+  " Nanosekunden");

        startZeit = System.nanoTime();
        InsertionSortb(lottoArray);
        stopzeit = System.nanoTime();
        System.out.println("Zeit für Zufälligen Array: " +(stopzeit-startZeit)+ " Nanosekunden");



            
    }

public static void getArrays(int zahlen){

        //Aufsteigend
    lottoArray = new int[zahlen];
    arrayAu = new int[zahlen];
    for (int i = 0;i<arrayAu.length;i++){
        arrayAu[i] = i+1;
        lottoArray[i] = i+1;
    }

    //Absteigend
    arrayAb = new int[zahlen];
    for (int i = 0;i<arrayAb.length;i++){
        arrayAb[i] = zahlen-i;
    }

    //Lottery
    temparray = new int[zahlen];
    int temper;
    int x;

    Random rnd = new Random();
    for(int i = 0; i< temparray.length; i++){
    temper =  rnd.nextInt(lottoArray.length - i);
    temparray[i] = lottoArray[temper];
    x = lottoArray[lottoArray.length-i-1];
    lottoArray[lottoArray.length-i-1] = lottoArray[temper];
    lottoArray[temper] =  x;

    }


    temparray = new int[zahlen];
    System.out.println(java.util.Arrays.toString(arrayAu));
    System.out.println(java.util.Arrays.toString(arrayAb));
    System.out.println(java.util.Arrays.toString(lottoArray));


}


    public static void bubbleSort(int[] numbers){
        int zwischenspeicher;
        int size = numbers.length;
        for(int x = 0; x<size;x++){
            for(int i =0; i<(size-x-1);i++){
                if(numbers[i]> numbers[i+1]){
                    zwischenspeicher = numbers[i];
                    numbers[i] =numbers[i+1];
                    numbers[i+1] = zwischenspeicher;
                    SchritteBubbleSort++;
                }
            }
        }
    }

    public static void insertionSort(int numbers[]) {
        for (int j = 1; j < numbers.length; j++) {
            int zwischenvar = numbers[j];
            int i = j - 1;
            while ((i > -1) && (numbers[i] > zwischenvar)) {
                numbers[i + 1] = numbers[i];
                i--;
            }
            numbers[i + 1] = zwischenvar;
        }
    }
    public static void InsertionSortb(int[] numbers) {


        for (int i = 1; i < numbers.length; ++i) {
            int key = numbers[i];
            int insertedPosition = binary(numbers, 0, i - 1, key);

            for (int j = i - 1; j >= insertedPosition; --j) {
                numbers[j + 1] = numbers[j];
            }

            numbers[insertedPosition] = key;
        }
    }

    public static int binary(int[] numbers, int start, int end, int var) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (var < numbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    }



