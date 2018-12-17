package com.itheima.test02;

/*e.定义测试类Test，在main方法实现以下功能：

        * 创建TV对象并赋值；

        * 创建RemoteControl对象,调用其controlTV的方法；

        * 创建Phone对象,调用其connecting方法和controlTV方法；*/
public class Test {
    public static void main(String[] args) {
        TV tv = new TV("海尔");
        RemoteControl r = new RemoteControl();
        r.controlTV(tv);
        System.out.println("=============");
        Phone phone = new Phone();
        phone.connecting();
        phone.controlTV(tv);
    }
}
