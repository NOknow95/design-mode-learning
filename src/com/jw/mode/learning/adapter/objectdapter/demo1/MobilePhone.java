package com.jw.mode.learning.adapter.objectdapter.demo1;

/**
 * 手机对象类
 *
 * @author NOknow
 * @version 1.0
 * @date 2020/03/28
 */
public class MobilePhone {

  /**
   * 给手机充电
   *
   * @param charger 充电器
   */
  public void charging(Charger charger) {
    System.out.println("给手机充电");
    int vol5v = charger.output5v();
    System.out.println(String.format("给手机充电的电压为%sv", vol5v));
  }
}
