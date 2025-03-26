public class SumOfAllElementsOfArray {

    public static void main(String[] args) {
        int [] arr = {2,1,4,3,6,5,7,8};
        int output = 0;

        for (int i =0; i < arr.length; i++){
            output = output + arr[i];
        }
        System.out.println("Sum of all numbers present in array is " + output);
    }
}
