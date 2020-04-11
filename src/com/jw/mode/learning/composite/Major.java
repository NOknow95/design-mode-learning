package com.jw.mode.learning.composite;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/11
 * @description
 */
public class Major extends OrganizationComponent {

  public Major(String name, String desc) {
    super(name, desc);
  }

  @Override
  public void print() {
    System.out.println("-" + getName() + "-" + getDesc());
  }

}
