package com.itheima.test02;
/*
b.定义接口RedRay，要求 ：

        1)定义抽象方法： void controlTV(TV tv)；

        2)定义默认方法： void connecting()，方法内,打印输出"外接设备,连接成功, 可以使用红外线"；*/

public interface RedRay {

    void controlTV(TV tv);

    public default void connecting(){
        System.out.println("外接设备,连接成功, 可以使用红外线");
    }
}
