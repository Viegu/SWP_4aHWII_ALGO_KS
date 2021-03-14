import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Vergleich_Sort_Algo {
    public static int bubbleArray[] = new int[1000];
    public static int selectionS[] = new int[1000];


   public static ArrayList<Integer> bubbleSortVergleiche = new ArrayList<Integer>();
    public static ArrayList<Integer> bubbleSortTausche = new ArrayList<Integer>();

    public static ArrayList<Integer> selectionSortVergleiche = new ArrayList<Integer>();
    public static ArrayList<Integer> selectionSortTausche = new ArrayList<Integer>();



    public static int vglbs=0;
    public static int swapbs=0;
    public static int vglss=0;
    public static int swapss=0;


    public static double bbsDurchschnittvergl;
    public static double bbsDurchschnitttausche;
    public static double ssDurchschnittvergl;
    public static double ssDurchschnitttausche;
    public static void main(String[] args) {
for(int i = 0;i<100;i++){
    makeArrays();
    bubblesort(bubbleArray);
    selectionSort(selectionS);
    bubbleSortVergleiche.add(vglbs);
    bubbleSortTausche.add(swapbs);
    selectionSortVergleiche.add(vglss);
    selectionSortTausche.add(swapss);
    vglbs=0;
    swapbs=0;
    vglss=0;
    swapss=0;


}
calcavg();
        Collections.sort(bubbleSortTausche);
        Collections.sort(selectionSortTausche);

        System.out.println("Durchschnittstausche Bubblesort: "+bbsDurchschnitttausche);
        System.out.println("Durchschnittsvergleiche Bubblesort: "+bbsDurchschnittvergl);
        System.out.println("Median Tausche Bubblesort: "+ bubbleSortTausche.get((bubbleSortTausche.size()/2)));
        System.out.println("");
        System.out.println("Durchschnittstausche SelectionSort: "+ssDurchschnitttausche);
        System.out.println("Durchschnittsvergleiche SelectionSort: "+ssDurchschnittvergl);
        System.out.println("Median Tausche Selectionsort: "+selectionSortTausche.get((selectionSortTausche.size()/2)));




      //  for(int i =0;i<ssDurchschnitttausche)
       // System.out.println(bubbleSortTausche);


    }


    public static void bubblesort(int array[]) {

        int n = array.length;

        for (int x = 0; x < n - 1; x++) {
            for(int y = 0; y<n-x-1; y++ ){
                if(array[y]> array[y+1]){
                    int tempvar= array[y];
                    array[y] = array[y+1];
                    array[y+1] = tempvar;
                    swapbs++;
                }
                vglbs++;
            }
        }

    }

    public static void makeArrays(){
        Random rndm = new Random();
        for(int i = 0;i<bubbleArray.length-1;i++){
            int a = rndm.nextInt(1000);
            bubbleArray[i] =a;
            selectionS[i]=a;

        }

    }
    public static void selectionSort(int array[]){
        int n = array.length;
        for(int x =0;x<n-1;x++){
            int min = x;
            for(int y = x+1;y<n;y++){
                vglss++;
                if(array[y] < array[min]){
                    min = y;


                }



            }
            int tempvar = array[min];
            array[min] = array[x];
            array[x] = tempvar;
            swapss++;

        }
    }

    public static void calcavg(){

        //BubbleSortTausche
        double tempvar=0;
        for(int i = 0;i<bubbleSortTausche.size();i++){
            tempvar = tempvar+ bubbleSortTausche.get(i);
        }
        bbsDurchschnitttausche =tempvar/bubbleSortTausche.size();
        tempvar =0;
        //BubbleSortVergleiche
        for(int i = 0;i<bubbleSortVergleiche.size();i++){
            tempvar = tempvar+ bubbleSortVergleiche.get(i);
        }
        bbsDurchschnittvergl =tempvar/bubbleSortVergleiche.size();
        tempvar =0;
        //SelectionSortVergleiche
        for(int i = 0;i<selectionSortVergleiche.size();i++){
            tempvar = tempvar+ selectionSortVergleiche.get(i);
        }
        ssDurchschnittvergl =tempvar/selectionSortVergleiche.size();
        tempvar =0;
        //SelectionSortTausche
        for(int i = 0;i<selectionSortTausche.size();i++){
            tempvar = tempvar+ selectionSortTausche.get(i);
        }
        ssDurchschnitttausche =tempvar/selectionSortTausche.size();


    }
}