package com.jw.mode.learning.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/11
 * @description
 */
public class College extends OrganizationComponent {

  List<OrganizationComponent> majors = new ArrayList<>();

  public College(String name, String desc) {
    super(name, desc);
  }

  @Override
  public void add(OrganizationComponent component) {
    majors.add(component);
  }

  @Override
  public void remove(OrganizationComponent component) {
    majors.remove(component);
  }

  @Override
  public void print() {
    System.out.println("---" + getName() + "----" + getDesc());
    majors.forEach(OrganizationComponent::print);
  }

  public List<OrganizationComponent> getMajors() {
    return majors;
  }
}
