import java.util.ArrayList;

public class AllZerosAtLast {

    public static void main(String[] args){
        int [] arr = {1,2,4,3,6,5,8,0,0,0,3,4,5,0,0,0,4,3,4,0,0,0};

        ArrayList<Integer> arrL = new ArrayList<>();
        int countOfZeros = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                countOfZeros = countOfZeros + 1;
            } else {
                arrL.add(arr[i]);
            }
        }

        for(int i =1; i <= countOfZeros; i++){
            arrL.add(0);
        }
        System.out.println(arrL);
    }
}
