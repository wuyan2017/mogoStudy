package proxy;


import org.apache.commons.lang.StringUtils;

/**
 * @author wuyan
 * @date 2018/7/27 9:39
 * Cglib动态代理的学习和使用
 */
public class CglibProxy {

    public static void main(String[] args) {
        String str="acb";
        System.out.println("aaa".concat(str));
        if(StringUtils.isBlank(str)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
