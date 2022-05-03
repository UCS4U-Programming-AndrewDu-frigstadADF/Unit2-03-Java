/**
 * doing more recursion stuff with towers of Hanoi
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-04-19
**/

// imports
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecBinarySearch {

    public 
    
    public static void main(String[] args) throws IOException {

        // declaring variables
        int checkingInt = 0;
        ArrayList<String> numberTxtList = new ArrayList<String>();
        int userNumInt = 0;

        File numberArray = new File("C:\\Users\\s278552\\Everything\\Unit2-03\\Unit2-03-Java\\numbers.txt");

        // printing out all the numbers in the text file
        System.out.println(numberArray);
        try (Scanner sc = new Scanner(numberArray)) {
            // makes it into a list kind of
            while (sc.hasNextLine()) {
                numberTxtList.add(sc.nextLine());
            }
        }

        System.out.println(numberTxtList);

        int[] num = new int[numberTxtList.size()];
        for (int arrayInt = 0; arrayInt < numberTxtList.size(); arrayInt = arrayInt + 1) {

            // try catch for the list
            try {
                // converting list index to an integer
                checkingInt = Integer.parseInt(numberTxtList.get(arrayInt));
            } catch (NumberFormatException e) {
                checkingInt = -1;
                break;
            }

            // putting integer into array
            num[arrayInt] = checkingInt;
        }

        if (checkingInt == -1) {
            System.out.println("invalid file");
        }
        Scanner myObj = new Scanner(System.in);
        System.out.println("What number do you want to find?");
        String userNum = myObj.nextLine();

        try {
            userNumInt = Integer.parseInt(userNum);
        } catch (NumberFormatException e) {
            userNumInt = -1;
        }

        if (userNumInt = -1) {
            System.out.println("Input a positive number");
        } else {

        }
    }

}
