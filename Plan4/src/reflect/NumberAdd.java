package reflect;

/**
 * @author wuyan
 * @date 2018/7/25 17:30
 */
public class NumberAdd {
    private int x;
    private int y;
    private String z;

    public NumberAdd(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public NumberAdd(String z) {
        this.z = z;
    }

    public NumberAdd() {
        System.out.println("无参构造函数");
    }

    public int  add(int a,int b){

        return a+b;
    }

    public String addString(String s){
        return s+"shanghai";
    }
}
