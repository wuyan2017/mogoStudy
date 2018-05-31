import org.junit.Test;

/**
 * @author : wuyan
 * @Date: 2018/5/31
 * @Time: 10:27
 * @Description:
 */
public class threadTest {
    @Test
    public void printString(){
        int cityId=CityNameEnum.CityNameDetail.ShangHai.cityId;
        if(cityId==131){
            System.out.println(CityNameEnum.CityNameDetail.BeiJing.cityName);
        }
        System.out.println(CityNameEnum.CityNameDetail.ShangHai.cityName);
    }
}
