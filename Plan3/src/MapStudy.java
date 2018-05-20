import java.util.*;

/**
 * @author : wuyan
 * @Date: 2018/5/20
 * @Time: 19:54
 * @Description:
 */
public class MapStudy {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("1","trump");
        hashMap.put("2","Obama");
        hashMap.put("3","bushi");
        Set<Map.Entry<String, String>> set=hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<String> keySet=hashMap.keySet();
        Iterator<String> keyIterator=keySet.iterator();
        while(keyIterator.hasNext()){
            System.out.println(keyIterator.next());
        }
        while (iterator.hasNext()){
            Map.Entry<String,String> entrySet= iterator.next();
            System.out.println(entrySet.getValue());
        }
    }
}
