public class LargestAndSecondLargestNumber {

    public static void main(String[] args) {
        int [] arr = {4,3,2,9,7,10,6,5};
        int largest = 0;
        int secondLargest =0;

        for(int i=0; i<arr.length;i++) {
            if(largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
