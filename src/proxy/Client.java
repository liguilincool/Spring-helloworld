package proxy;

public class Client {

    public static void main(String[] args) {



        MyInvocationHandler dp=new MyInvocationHandler(new MyTarget());
        Api obj= (Api) dp.proxy();

        obj.t();

    }
}
