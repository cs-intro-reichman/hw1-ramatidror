public class Bill3 {
    public static void main(String[] args) {
        String diner1 = args [2];
        String diner2 = args [1];
        String diner3 = args [0];
        int bill = Integer.parseInt(args [3]);
        double splitedBill = Math.ceil (bill/3.0);
        System.out.println ("Dear " + diner1 + ", "  + diner2 + ", and " + diner3 + ": pay " + splitedBill + " Shekels each");

        }
    }
