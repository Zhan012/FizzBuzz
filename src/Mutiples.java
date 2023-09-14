public class Mutiples {
    public static int mutiple(int n, int a, int b) {
        int j = 0;
        for (int i = 1; i < n; i++) {
            boolean db3 = i % a == 0;
            boolean db5 = i % b == 0;

            if (db3 || db5){
                j++;
            }
        }
        return j;
    }
}
