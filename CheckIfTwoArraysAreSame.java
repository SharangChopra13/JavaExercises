import java.util.Arrays;

public class CheckIfTwoArraysAreSame {

    public static void main(String[] args) {
        int [] arr1 = {2,4,3,5,7,6,8,9};
        int [] arr2 = {2,4,3,5,6,7,8,9};

        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
