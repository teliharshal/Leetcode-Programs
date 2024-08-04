public class ArrangeCoins {

    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));

    }
    public static int arrangeCoins(int n) {

        long start = 0; // we use "long" because we may get an integer overflow
        long end = n;
        while(start <= end){
            long pivot = start + (end - start) / 2;
            long coinsUsed = pivot * (pivot + 1)/2;
            if(coinsUsed == n){
                return (int)pivot;
            }
            if(n < coinsUsed){
                end = pivot-1;
            }
            else{
                start = pivot + 1;
            }
        }
        return (int)end;
    }
}
