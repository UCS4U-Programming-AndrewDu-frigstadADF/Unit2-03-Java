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
import java.util.Arrays;

public class RecBinarySearch {

    public static int binarySearch(int userNumInt, int[] num, int l, int r) {

        int mid = ((r - l) / 2) + l;
        System.out.println(l + " " + mid + " " + r + " | " + userNumInt + " " + num[mid]);

        if (r < l) {

            // return fail
            return -1;

            // if number is in the middle then return the middle number
        } else if (num[mid] == userNumInt) {
            return mid;

            // if the number is smaller than the middle number then go to the left
        } else if (num[mid] > userNumInt) {
            return binarySearch(userNumInt, num, l, mid - 1);

            // if the number is bigger than the middle than go to the right
        } else {
            return binarySearch(userNumInt, num, mid + 1, r);
        }
    }

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

        // sort the array
        Arrays.sort(num);
        int n = num.length;

        // check the file
        if (checkingInt == -1) {
            System.out.println("invalid file");
        }
        Scanner myObj = new Scanner(System.in);

        // get the number to search
        System.out.println("What number do you want to find?");
        String userNum = myObj.nextLine();

        // make sure the user's number is positive
        try {
            userNumInt = Integer.parseInt(userNum);
        } catch (NumberFormatException e) {
            userNumInt = -1;
        }

        if (userNumInt <= -1) {
            System.out.println("Input a positive number");
        } else {

            // call and print the binary search
            int result = binarySearch(userNumInt, num, 0, n);
            System.out.println(result);

            if (result == -1) {
                System.out.println("That number is not in the list");
            } else {
                System.out.println("Element found in index " + result);
            }

        }
    }

}