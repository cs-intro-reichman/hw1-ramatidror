public class Ascend {
    public static void main(String[] args) {

        int lim = Integer.parseInt(args[0]);
        int a =  (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
        int tempMaxVlaue = Math.max(a, c);
        int maxValue = Math.max (tempMaxVlaue, b);
        int tempMinVlaue = Math.min(a, c);
        int minValue = Math.min(tempMinVlaue, b);
        int middleValue = ((a + b + c) - maxValue - minValue);

        System.out.println(a + " " + b + " " + c);
        System.out.println(minValue + " " + middleValue + " " + maxValue);

    }
}
