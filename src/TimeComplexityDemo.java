package src;

public class  TimeComplexityDemo {

    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSum(99999));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " millis.");
    }

    private int findSum(int n) {
        return n * (n + 1) / 2;
    }

//    private int findSum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum +=i;
//        }
//        return sum;
//    }

}
