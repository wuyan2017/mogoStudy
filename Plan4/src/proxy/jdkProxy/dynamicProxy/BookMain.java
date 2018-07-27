package proxy.jdkProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author  wuyan
 * @date 2018/7/26
 */
public class BookMain {
    public  static  void main(String [] args){
        BookImpl bookImpl = new BookImpl();
        InvocationHandler target=new BookProxy(bookImpl);
        Book dynamicProxy=(Book) Proxy.newProxyInstance(BookImpl.class.getClassLoader(),BookImpl.class.getInterfaces(),target);
        dynamicProxy.addBook();
    }
}
