/*Nicholas Weber 
 *prompt the user for a sentence
 *sorts the sentence alphabetically
 *prits out only the words that are not the first and last alphabetically 
 */
package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NonExtremeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence? ");
        String sent = scanner.nextLine();
        String[] a = sent.split("\\s+");
        ArrayList<String> removedFL = removeFL(a);
        printNew(removedFL);
    }
    //add the words to an arraylist and sorts it alphbetically finds the
    //first and last words 
    //adds those who are not the first and the last to a new array and prints those out 
    public static ArrayList<String> removeFL(String[] a){
        ArrayList<String> newA = new ArrayList<String>();
        String[] sorted = new String[a.length];
        for ( int i = 0; i<a.length;i++ ){
            sorted[i] = a[i];
        }
        Arrays.sort(sorted);
        String first = sorted[0];
        String last = sorted[sorted.length-1];
        
        for ( String j : a ){
            if (j!=first && j!=last){
                newA.add(j);
            }
        }
        return newA;
    }
    //prints array one per line 
    public static void printNew(ArrayList<String> removedFL){
        for ( String i : removedFL ){
            System.out.println(i);
        }
    }
}
