package TestLombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Builder;

/**
 * @author : wuyan
 * @Date: 2018/5/4
 * @Time: 11:50
 * @Description:
 */
@Setter
@Getter
public class TestLombok {
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
