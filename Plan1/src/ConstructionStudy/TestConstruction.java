package ConstructionStudy;

/**
*@Author:吴焰
*@Description:
*@Date:10:29 2018/5/4
*@param
*@return 
**/

public class TestConstruction {

    String name;
    String nationaltity;
    String hoby;
    public TestConstruction(String name){
        this.name=name;
    }
    public TestConstruction(String name,String nationaltity){
        this.name=name;
        this.nationaltity=nationaltity;
    }

    public static void main(String[] args) {
        TestConstruction testConstruction=new TestConstruction("Trump");
        System.out.println(testConstruction.name);
        TestConstruction testConstruction1=new TestConstruction("Trump","USA");
        System.out.println(testConstruction1.name+":"+testConstruction1.nationaltity);
    }

}
