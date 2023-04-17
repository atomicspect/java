package com.实验4;

public class BeijingPeople extends ChinaPeople {
    //重写public void averageHeight()方法,输出:"北京人的平均身高: 172.5厘米"
    public void averageHeight() {
        System.out.println("北京人的平均身高: 172.5厘米");
    }
    //重写public void averageWeight()方法,输出:"北京人的平均体重：70公斤"
    public void averageWeight() {
        System.out.println("北京人的平均体重：70公斤");
    }
   public void beijingOpera() {
       System.out.println("花脸、青衣、花旦和老生");
   }
}
