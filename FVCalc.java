public class FVCalc {
    public static void main (String [] args) {
        int investedSum = Integer.parseInt (args [0]);
        double intrestRate = Double.parseDouble (args [1]);
        int years = Integer.parseInt (args [2]);
        int  futureValue = (int) (investedSum * Math.pow ((1 + intrestRate/100), years)) ;
        System.out.println ("After " + years + " years, a $" + investedSum + " saved at " + intrestRate + "% will yield $" + futureValue);
    }
}
