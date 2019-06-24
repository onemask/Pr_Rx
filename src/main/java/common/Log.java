package common;

public class Log {

    public static void i(Object obj){
        System.out.println(getThreadName() + " | value = "  + obj);
    }

    public static void d(String tag,Object obj){
        System.out.println(getThreadName() +" | " + tag + " | debug = " + obj);
    }

    public static void v(Object obj){
        System.out.println(getThreadName() + " | " + obj);
    }

    public static String getThreadName(){
        String threadName = Thread.currentThread().getName();
        if(threadName.length() >30){
            threadName = threadName.substring(0,30) +"...";
        }return threadName;
    }

}
