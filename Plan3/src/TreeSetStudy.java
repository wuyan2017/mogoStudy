import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author : wuyan
 * @Date: 2018/5/20
 * @Time: 19:44
 * @Description:
 */
public class TreeSetStudy {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(8);
        Iterator<Integer> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*boolean remove=treeSet.remove(20);
        if(remove){
            System.out.println("remove success!");
        }*/
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
