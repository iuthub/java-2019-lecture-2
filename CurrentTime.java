public class CurrentTime {
    public static String get(){
        long ticks = System.currentTimeMillis(); //01.01.1970 00:00:00 - epoch
        int hours = (int)((ticks/(1000*60*60)) % 24);
        int minutes = (int)(((ticks/(1000*60)) % (24*60)) % 60);

        return hours + ":" + minutes;
    }

}
