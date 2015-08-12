package foo.bar;

import org.springframework.stereotype.Component;

@Component("p")
public class HelloService {
    private String mMsg;

    public String getMsg() {
        return mMsg;
    }

    public void setMsg(String msg) {
        mMsg = msg;
    }

    public String sayHello() {
        return "Hello world!";
    }

}
