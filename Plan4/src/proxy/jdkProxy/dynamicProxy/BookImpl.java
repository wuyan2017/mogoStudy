package proxy.jdkProxy.dynamicProxy;

/**@author  wuyan
 * 2、实现业务逻辑接口 创建业务实现类
 */
public class BookImpl implements  Book {
    @Override
    public void addBook() {
        System.out.println("增加图书————");
    }
}
