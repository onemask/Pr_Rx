package chapt5;

import common.CommonUtils;
import common.Log;
import common.Shape;
import io.reactivex.Observable;

public class Schedulers_5_1 {
    public static void main(String[] args) {

/*        //Ojbservable 생성
        Observable.just("Hello", "RxJava2 ")
                .subscribe(System.out::println);*/

        /*//Observable 생성 맞음. LogClass를 사용하여 Thread사용할 수 있음.
        Observable.just("Hello","RxJava","U SO HARD TO LEARN TO ME!!")
                .subscribe(Log::i);*/

        //
        String[] obj = {"1-S","2-T","3-P"};
        Observable<String> source = Observable.fromArray(obj)
                .doOnNext(data -> Log.v("Orginial data = " + data))
                .subscribeOn(io.reactivex.schedulers.Schedulers.newThread())
                .observeOn(io.reactivex.schedulers.Schedulers.newThread())
                .map(Shape::flip);
        source.subscribe(Log::i);
        CommonUtils.sleep(500);



       /* //결과를 수신할때 처리하는 Observer
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
*/





    }

    }
