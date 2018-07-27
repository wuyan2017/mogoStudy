package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * @author wuyan
 * @date 2018/7/25 17:27
 */
public class Demo1 {
    public static void main(String[] args) {
        NumberAdd numberAdd=new NumberAdd();
        Class c=numberAdd.getClass();
        try {
            //获取所有字段的名称
            Field[] fields=numberAdd.getClass().getDeclaredFields();
            for(int i=0;i<fields.length;i++){
                System.out.println(fields[i].getName());
                System.out.println(fields[i].getType());
            }
            if(c.isAssignableFrom(NumberAdd.class)){
                System.out.println("c是NumberAdd的类");
            }

            //获取方法
            Method method=c.getMethod("add",int.class,int.class);
            Object o=method.invoke(numberAdd,1,2);
            System.out.println(o);

            Method method1=c.getMethod("addString",String.class);
            Object o1=method1.invoke(numberAdd,"string");
            System.out.println(o1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

