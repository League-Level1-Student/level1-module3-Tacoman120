package _05_cow_timer;

public class CowTimerRunner {
    public static void main(String[] args) throws InterruptedException {
        /* Make a CowTimer, set its time and start it.
         * Use a short delay (seconds) when testing, then try with longer delays
         */
        CowTimer cow = new CowTimer(1);
        for(int x = 10; x>0; x--){
        cow.setTime(x);
        cow.start();
        }
    }
}
