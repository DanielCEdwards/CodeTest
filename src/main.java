import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class main {

    public static void main(String[] strings) {
        //Setup Integer Array to hold list of numbers
        ArrayList<Integer> numbersToSort = new ArrayList<Integer>();
        //Call De-Dupe method
        numbersToSort = removeDuplicates(getListOfNumbers());
        //Sort the list of number start with the lowest
        Collections.sort(numbersToSort);
        System.out.println("Sorted and de-duped");
        for (int i = 0; i < numbersToSort.size(); i++) {
            System.out.println(numbersToSort.get(i));
        }
    }

    public static ArrayList<Integer> getListOfNumbers() {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        int x;
        int y =0;
        Scanner getNumbers = new Scanner(System.in);
        // Read in User input
        System.out.println("Please enter 10 number between 1 and 100");
        for (x = 0; x < 10; x++) {
            while(true) {
                try {
                    y = Integer.parseInt(getNumbers.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Please enter a Number! ");
                }
            }

            //Only add if the number is between 1 and 100.
            if (y > 0 && y < 100) {
                numberList.add(y);
            }
        }
        return numberList;
    }

    // Function to remove duplicates from an ArrayList
    public static <N> ArrayList<N> removeDuplicates(ArrayList<N> list) {
        ArrayList<N> newList = new ArrayList<N>();
        // Loop through the list
        for (N element : list) {
            // If number is not already in the list then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        // return the de-duped list of numbers
        return newList;
    }
}
