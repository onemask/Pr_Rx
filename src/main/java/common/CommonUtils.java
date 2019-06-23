package common;

public class CommonUtils {

    public static final String GITHUB_ROOT = "https://raw.githubusercontent.com/yudong80/reactivejava/master/";
    public static final String API_KEY = "5712cae3137a8f6bcbebe4fb35dfb434";

    public static final String ERROR_CODE = "-500";
    public static long startTime;

    public static void sleep(int mills){
        try{
            Thread.sleep(mills);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }



}
