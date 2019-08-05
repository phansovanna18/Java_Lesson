package MultiThreading;

import java.security.PrivilegedExceptionAction;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class task1 {
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try{
                    while (true){
                        System.out.println(i++);
                        Thread.sleep(1000);
                    }
                }catch (Exception a){}
            }
        });
        a.start();
        System.out.println("Hello world");
    }
}

class run extends Thread{
    @Override
    public void run() {

        try{

        while (true){
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.println( sdf.format(cal.getTime()) );
            Thread.sleep(100);
        }}catch (Exception a){}
    }
}

