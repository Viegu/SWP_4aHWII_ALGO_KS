import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args){
        int arraylenght, randomnumber;
        int a = 1;




        System.out.println("Geben Sie die Länge des Arrays ein: ");
        arraylenght = reader.nextInt();
        int randomNum = ThreadLocalRandom.current().nextInt(1, arraylenght + 1);

        int[] numbers = new int[arraylenght];

        for(int i = 0; i<arraylenght;i++){
            numbers[i] = i+1;
        }
        System.out.println("Gesuchte Zahl : "+randomNum);

        System.out.println(normalsearch(numbers,randomNum));
        System.out.println("");
        System.out.println(binarySearch(numbers,randomNum));


    }

    public static String normalsearch (int numbers[], int randomnumber){
        long startTime = System.currentTimeMillis();
        boolean found = false;
        int i = 1;


        do{

    if(i == numbers[randomnumber]){
        found = true;
    }else {
        i++;
    }

}while(found == false);
        long endtime = System.currentTimeMillis();


        return "Die Normale Suche hat bei " + numbers.length +" zahlen "+ (endtime- startTime)+ "ms gebraucht";


    }

    /*public static String binarySearch(int numbers[], int randomnumber){
        long startTime = System.currentTimeMillis();
        boolean found = false;

        int schritte = 0;
        int newnumber = numbers.length;
        int oldnumber = newnumber/2;



        do{
            System.out.println(newnumber);
oldnumber = oldnumber/2;
        schritte ++;

        if(newnumber > randomnumber){

newnumber = newnumber - oldnumber;
        }else if(newnumber < randomnumber){
           newnumber = newnumber + oldnumber;
            }else if(newnumber == randomnumber ){
            found = true;
        }
        }while(found == false);
        long endtime = System.currentTimeMillis();


  return "Die Binäre Suche hat bei " + numbers.length +" zahlen "+ (endtime- startTime)+ "ms gebraucht und dabei " + schritte + " Schritte gebraucht";
    }
    */


    public static String binarySearch(int array[],int rnum){
        long startTime = System.currentTimeMillis();
        int start = 1;
        int end = array.length;
        int mid = array.length/2;
        int schritte = 0;
        boolean found = false;
        do {
            schritte++;
            if(rnum > mid){
                start = mid;
                mid = (start + end)/2;
            }else if(rnum < mid){
                end = mid;
                mid = (start+end)/2;

            }else{
                found = true;
            }


        }while(found == false);



        long endtime = System.currentTimeMillis();


        return "Die Binäre Suche hat bei " + array.length +" zahlen "+ (endtime- startTime)+ "ms gebraucht und dabei " + schritte + " Schritte gebraucht";

    }

}
