package TestLombok;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : wuyan
 * @Date: 2018/5/4
 * @Time: 11:50
 * @Description:
 */
@Setter
@Getter
public class TestLombok {
    /**
     * @Setter @Getter方法使用还存在问题，不能使用set和get方法
     * */
        String name;
        String nationaltity;
        String hoby;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNationaltity() {
            return nationaltity;
        }

        public void setNationaltity(String nationaltity) {
            this.nationaltity = nationaltity;
        }

        public String getHoby() {
            return hoby;
        }

        public void setHoby(String hoby) {
            this.hoby = hoby;
        }

        @Override
        public String toString() {
            return "people{" +
                    "name='" + name + '\'' +
                    ", nationaltity='" + nationaltity + '\'' +
                    ", hoby='" + hoby + '\'' +
                    '}';
        }


    public static void main(String[] args) {
       TestLombok people1=new TestLombok();
       people1.setName("Trump");
       people1.setHoby("Boast");
       people1.setNationaltity("USA");
        System.out.println(people1.toString());
    }
}
