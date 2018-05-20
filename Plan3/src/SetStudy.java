import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author : wuyan
 * @Date: 2018/5/20
 * @Time: 19:18
 * @Description: HashSet的使用及其方法
 */
public class SetStudy {
    public static void main(String[] args) {
        Set<String> nameSet=new HashSet<String>();
        nameSet.add("trump");
        nameSet.add("Obama");
        nameSet.add("bushi");
        boolean add=nameSet.add("trump");
        if(add){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败，有重复！");
        }
        /**输出set中的元素大小*/
        System.out.println(nameSet.size());
        /**利用迭代器输出set中的所有元素*/
        Iterator<String> iterator=nameSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /**检查set中是否含有某一个元素*/
        if(nameSet.contains("trump")){
            System.out.println(true);
        }
        /**清空set中的元素*/
        nameSet.clear();
        Iterator<String> iterator1=nameSet.iterator();
        if(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        /**判断set中是否还有元素*/
        if(nameSet.isEmpty()){
            System.out.println("nameSet is Empty!!!");
        }

    }
}
