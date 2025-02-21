public class PrintOnlyVisibleTrees {

    public static void main(String[] args){
        int [] arr = {3,9,2,11,13,9,18,21,21};
        int visibleTree = arr[0];

        System.out.print(visibleTree);
        for (int i =1; i < arr.length; i++){
            if(visibleTree < arr[i]){
                System.out.print(" " + arr[i]);
                visibleTree = arr[i];
            }
        }
    }
}
