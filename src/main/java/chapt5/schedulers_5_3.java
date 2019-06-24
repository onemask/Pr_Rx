package chapt5;

import common.CommonUtils;
import common.Log;
import common.Shape;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class schedulers_5_3 {

    public static void main(String[] args) {
        String[] obj = {"1-S", "2-T", "3-P"};
        Observable<String> source = Observable.fromArray(obj)
                .doOnNext(data -> Log.v("Orginial data = " + data))
                .subscribeOn(Schedulers.newThread())
                //.observeOn(Schedulers.newThread())
                .map(Shape::flip);

        source.subscribe(Log::i);
        CommonUtils.sleep(500);
    }


}