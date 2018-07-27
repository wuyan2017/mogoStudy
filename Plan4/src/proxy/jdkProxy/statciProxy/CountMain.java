package proxy.jdkProxy.statciProxy;

/**
 * @author wuyan
 * @date 2018/7/27
 */
public class CountMain {

    public  static  void main(String [] args){
        CountImpl countImpl = new CountImpl();
        CountProxy countProxy = new CountProxy(countImpl);
        countProxy.queryCount();
        countProxy.updateCount();

    }
}
