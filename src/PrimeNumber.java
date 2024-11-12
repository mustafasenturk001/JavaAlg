public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(1999));
        System.out.println(isPrime(499));
        System.out.println(isPrime(19));
        System.out.println(isPrime(49943534));
        System.out.println(isPrime(49));
    }

    public static boolean isPrime(int a){
        if (a == 0 || a == 1)
            return false;
        if (a == 2)
            return true;
        for (int i = 2; i <= a/2; i++){
            if (a % i == 0)
                return false;

        }
        return true;
    }
}
