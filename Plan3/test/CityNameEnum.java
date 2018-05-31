/**
 * @author : wuyan
 * @Date: 2018/5/31
 * @Time: 10:42
 * @Description:
 */
public class CityNameEnum {

    public enum CityNameDetail{
        BeiJing(131,"北京"),
        ShangHai(289,"上海");

        Integer cityId;
        String cityName;
        public Integer getCityId() {
            return cityId;
        }

        public void setCityId(Integer cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        CityNameDetail(int cityId,String cityName){
            this.cityId=cityId;
            this.cityName=cityName;
        }

    }

}
