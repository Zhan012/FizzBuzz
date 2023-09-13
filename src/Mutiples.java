public class Mutiples {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i < 1000; i++) {
            boolean db3 = i % 3 == 0;
            boolean db5 = i % 5 == 0;

            if (db3 || db5){
                j++;
            }
        }
        System.out.println(j);
    }
}
