package rx;

public interface Subscription {
    //통지 받을 데이터 개수 요청
    public void request(long num);

    //구독 해지
    public void cancle();
}
