public class TimeFormat {
    public static void main (String [] args) {

        int hoursInput = Integer.parseInt (args [0]);
        int convertedHours = (hoursInput - 12);
        int minutesInput = Integer.parseInt (args [1]);



        boolean aM = (hoursInput <= 11 && hoursInput >= 00);
        boolean smallMinutes = minutesInput < 10;

        if ((hoursInput > 23) || (hoursInput < 00) || (minutesInput > 59)|| (minutesInput < 0)) {
            System.out.println ("illegal value");}
        else if((aM) && (smallMinutes)) {System.out.println (hoursInput + ":" + "0" + minutesInput + " AM");}
        else if((aM) && (!smallMinutes)) {System.out.println (hoursInput + ":" + minutesInput + " AM");}
        else if((!aM) && (smallMinutes)) {System.out.println (hoursInput + ":" + "0" + minutesInput + " PM");}
        else { System.out.println ( convertedHours + ":" + minutesInput + " PM");}

    }
}
