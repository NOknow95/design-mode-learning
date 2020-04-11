package com.jw.mode.learning.adapter.objectdapter;

/**
 * 对象适配器-测试类
 *
 * @author NOknow
 * @version 1.0
 * @date 2020/03/28
 */
public class Test {

  public static void main(String[] args) {
    //实例化手机
    MobilePhone mobilePhone = new MobilePhone();
    //实例化220V电源电压
    Voltage220v voltage220v = new Voltage220v();
    //只有200V电压的电源，不符合手机充电的电压要求，所以构造一个电压适配器（手机充电器）
    ChargerAdapter chargerAdapter = new ChargerAdapter(voltage220v);
    //给手机充电
    mobilePhone.charging(chargerAdapter);
  }

}
