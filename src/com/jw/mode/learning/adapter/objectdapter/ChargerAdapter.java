package com.jw.mode.learning.adapter.objectdapter;

/**
 * 手机充电器适配器
 *
 * @author NOknow
 * @version 1.0
 * @date 2020/03/28
 */
public class ChargerAdapter implements Charger {

  /**
   * <p>如果ChargerAdapter去继承Voltage220v，则为类适配器模式。</p>
   * <p>这里则是使ChargerAdapter持有Voltage220v的实例，则为对象适配器模式。</p>
   * <p>（根据“合成复用原则”，在系统中尽量使用关联关系来代替继承关系）</p>
   */
  protected Voltage220v voltage220v;

  /**
   * 构造器传入220V电压实例
   */
  public ChargerAdapter(Voltage220v voltage220v) {
    this.voltage220v = voltage220v;
  }

  /**
   * 实现Charger接口中输出5v的方法
   *
   * @return 电压
   */
  @Override
  public int output5v() {
    System.out.println(String.format("适配器输入电压为：%s v", this.voltage220v.output()));
    int vol220v = voltage220v.output();
    int result = transformVoltage(vol220v, 5);
    System.out.println(String.format("适配器输出电压为：%s v", result));
    return result;
  }

  /**
   * 具体怎么将220V电压转为5V电压
   *
   * @return 电压
   */
  private int transformVoltage(int vol220v, int targetVol) {
    System.out.println(String.format("将%sv电压转换为%sv电压", vol220v, targetVol));
    return vol220v / 44;
  }
}
