package chapt5;

import common.Log;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Schedulers {
    public static void main(String[] args) {
       /* Observable.just("What is so difficult?", "to learing rx")
                //.subscribe(System.out::println);
                .subscribe(System.out.println();;*/
        //Why is only user in subscirbe in method Reperence?

        Observable.just("Hello", "RxJava2 ")
                .subscribe(System.out::println);

        Observable.just("Hello","RxJava","U SO HARD TO LEARN TO ME!!")
                .subscribe(Log::i);

        //결과를 수신할때 처리하는 Observer
        Observer<String> mObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };




    }

    }
