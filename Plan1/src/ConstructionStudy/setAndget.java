package ConstructionStudy;

import ConstructionStudy.TestSeterAndGetter;
import org.junit.Test;

/**
 * @author : wuyan
 * @Date: 2018/5/4
 * @Time: 11:46
 * @Description:
 */
public class setAndget {
    @Test
    public void testSetterandGetter(){
        TestSeterAndGetter testSeterAndGetter=new TestSeterAndGetter();
        testSeterAndGetter.setName("Trump");
        testSeterAndGetter.setNationaltity("USA");
        testSeterAndGetter.setHoby("boast");
        System.out.println(testSeterAndGetter.name+":"+testSeterAndGetter.nationaltity+":"+testSeterAndGetter.hoby);
    }
}
