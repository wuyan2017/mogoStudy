import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author : wuyan
 * @Date: 2018/5/20
 * @Time: 18:56
 * @Description:
 */
public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(31);
        list.add(22);
        list.add(33);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1.size());
        Collections.sort(list);
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
