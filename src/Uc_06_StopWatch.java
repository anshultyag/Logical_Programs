import java.util.Scanner;

public class Uc_06_StopWatch {
    public static long startTime = 0;
    public static long stopTime =0;
    public static long elapseTime=0;
    public static void start(){
        startTime = System.currentTimeMillis();
    }
    public static void stop(){
        stopTime = System.currentTimeMillis();
    }
    public static long elapse(){
        elapseTime = stopTime - startTime;
        return elapseTime;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Press 2 to start");
        int a = obj.nextInt();
        if (a == 2){
          start();}
        System.out.println("Press 3 to stop");
        int b=obj.nextInt();
        if (b == 3){
            stop();}
        long time=elapse();
        long totalTime = time/1000;
        System.out.println("Elapsed time: " + totalTime + " sec" );

    }
}
