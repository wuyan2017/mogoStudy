package ExceptionStudy;

import com.sun.javaws.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : wuyan
 * @Date: 2018/5/4
 * @Time: 10:36
 * @Description:
 */
public class TestException {
    public static void main(String[] args) {
        TestException testException=new TestException();
        String str=testException.OpenFile().toString();
        System.out.println(str);
    }
    public String OpenFile(){
        /**文件路径不能是文件夹，例如：读取D:\data\mogologs\bs文件夹时会报错
         * java.io.FileNotFoundException: D:\data\mogologs\bs (拒绝访问。)
         * */
        try {
            FileInputStream  fileInputStream=new FileInputStream("D:\\data\\mogologs\\bs\\log.error");
            int ch=fileInputStream.read();
            while (ch!=-1){
                char c=(char)ch;
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("没有找到文件！");
            e.printStackTrace();
            return "not found";
        } catch (IOException e) {
            System.out.println("读写异常！");
            e.printStackTrace();
            return "IO Exception";
        }finally {
            System.out.println("操作文件");
        }
        return "operate file";
    }
}
