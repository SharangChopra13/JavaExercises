public class PrimeNumber {

    public static void main(String[] args) {
        int number =6;
        boolean isPrime = true;
        for(int i=2;i <number;i++) {
            if(number % i==0) {
                isPrime = false;
            }
        }
        System.out.print(isPrime);
    }
}
