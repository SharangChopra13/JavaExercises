public class OddEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int [] arr = {3,2,4,1,5,4,5,6,7};

        for (int i =0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println("Even :- " + arr[i]);
            } else {
                System.out.println("Odd : - " + arr[i]);
            }
        }
    }
}
