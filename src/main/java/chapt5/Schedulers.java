package chapt5;

import io.reactivex.Observable;

public class Schedulers {
    public static void main(String[] args) {
        Observable.just("What is so difficult?", "to learing rx")
                .subscribe(System.out::println);
        
    }
}
