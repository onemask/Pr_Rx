package chpt1;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Consumer;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FistExample {
    private void emit(){
        Observable.just("Hello ", "RxJava 2 !!","myname is soo")
                .subscribe(System.out::println);
    }

    public static void main(String args[]){
        /*FirstExample demo = new FirstExample();
        demo.emit();*/

        /**
         * Callable Example
         */
        Callable<String> call  =() ->{
            Thread.sleep(1000);
            return "Hello Thread";
        };
        Observable<String> testCallable = Observable.fromCallable(call);
        testCallable.subscribe(System.out::println);

        /**
         * fromFuture
         */
        Future<String> future = Executors.newSingleThreadExecutor().submit(()->{
            Thread.sleep(1000);
            return "Hello Futhre";
        });
        Observable<String> testFutire = Observable.fromFuture(future);
        testFutire.subscribe();

        /**
         * formPublisher
         */

    }

    private void coldObservalble(){
        Observable<Integer> source = Observable.create(
                (ObservableEmitter<Integer> emitter) ->{
                    emitter.onNext(100);
                    emitter.onNext(200);
                    emitter.onNext(300);
                });

        //그냥
        //source.subscribe(System.out::println);

        //Lamda
        source.subscribe(data -> System.out.println(data));

        //익명 객체 활용.
        source.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer data) throws Exception {
                System.out.println("data " + data);
            }
        });
    }

    private void testFromArray(){
        Integer[] array = {100,200,300};
        Observable<Integer> formArray = Observable.fromArray(array);
        formArray.subscribe(System.out::println);
    }

}

