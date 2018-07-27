package proxy.jdkProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author  wuyan
 * @date 2018/7/26
 * 3、调用管理接口 InvocationHandler 创建动态代理类
 */
public class BookProxy  implements InvocationHandler{

    private  Object target;

    public BookProxy( Object target) {

        this.target=target;
    }

    /**
     *  包装调用方法：进行预处理、调用后处理
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("预处理操作————");
        result = method.invoke(target,args);
        System.out.println("调用后处理操作————");
        return result;
    }
}
