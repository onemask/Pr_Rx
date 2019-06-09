package rx;/*
package another_rx;

import io.reactivex.Flowable;

public class num1 extends Publisher {
    public static void main(String[] args){
        Flowable<String> floawable =  Flowable.just("hello" ,"iam","rx");
        floawable.subscribe(data -> System.out.println(data));
    }

    @Override
    public void subscribe(Subscriber subscriber) {

            }


    */
/**
     *  데이터를 통지하는 생산자.
     *//*

    public interface Publisher<T>{
        //데이터를 받는 Subscriver 등록
        public void subscribe(Subscriber<? super T> subscriber);
    }

    */
/**
     * 데이터를 받아 처리하는 소비자
     *//*

    public interface  Subscriber<T>{
        //구독 시작 시 처리
        public void onSubscribe(Subscription subscription);

        //데이터 통지 시 처리
        public void onNext(T item);

        //에러 통지 시 처리
        public void onError(Throwable error);

        //완료 통지 시 처리
        public void onComplete();
    }

    */
/**
     *  생산자와 소비자를 연결하는 인터페이스
     *//*

    public interface  Subscription{

        //통지 받을 데이터 개수 요청
        public void request(long num);

        //구독 햊,
        public void cancle();

    }


    public abstract interface processor<T,R> extends Subscriber<T>, Publisher<R> {}



}


*/
