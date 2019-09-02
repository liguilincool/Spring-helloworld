package proxy;

public class MyProxy implements Api {

    private Api api;

    public MyProxy(Api api) {
        this.api = api;
    }

    @Override
    public void t() {
        System.out.println("之前....");
        this.api.t();
        System.out.println("之后....");
    }
}
