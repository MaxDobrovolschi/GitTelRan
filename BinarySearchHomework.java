import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class BinarySearchHomework {

    private static int targetNumber = 50;
    private static final int[] newArray = {50, 47, 44, 41, 38, 35, 32, 29, 26, 23, 20, 17, 14, 11, 8};

    public static void main(String[] args) {


        List<Integer> newList = new ArrayList<>(Arrays.asList(8, 11, 14, 17, 20, 23, 26, 29, 32, 35, 41));


        BinarySearchHomework binarySearch1 = new BinarySearchHomework();
        int i = binarySearch1.binarySearch(newArray, targetNumber);
        System.out.println("The position of target index in newArray, array is: " + i);

        System.out.println(isItFarRight());
        System.out.println(isItFarLeft());

        int targetKey = 11;
        int digitPositioninArrayList = Collections.binarySearch(newList, targetKey);

        if (digitPositioninArrayList == -1) {
            System.out.println("This index isn't present in the list");

        } else {
            System.out.println("The position of target index in newList is: " + digitPositioninArrayList);
        }


    }
    private static int binarySearch(int[] newArray, int targetNumber) {
        int leftIndex = 0;
        int rightIndex = newArray.length - 1;
        int mid = 0;

        while (leftIndex <= rightIndex) {
            mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (newArray[mid] == targetNumber){
                return mid;
            }
            if (newArray[mid] < targetNumber) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }
        }
        return -1;
    }

    private static boolean isItFarLeft() {
        if (targetNumber == newArray[0]) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isItFarRight() {
        if (targetNumber == newArray[14]) {
            return true;
        } else {
            return false;
        }
    }
}
