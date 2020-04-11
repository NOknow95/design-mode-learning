package com.jw.mode.learning.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/11
 * @description
 */
public class University extends OrganizationComponent {

  List<OrganizationComponent> colleges = new ArrayList<>();

  public University(String name, String desc) {
    super(name, desc);
  }

  @Override
  public void add(OrganizationComponent component) {
    colleges.add(component);
  }

  @Override
  public void remove(OrganizationComponent component) {
    colleges.remove(component);
  }

  @Override
  public void print() {
    System.out.println("----------------" + getName() + "----" + getDesc());
    colleges.forEach(OrganizationComponent::print);
  }

  public List<OrganizationComponent> getColleges() {
    return colleges;
  }
}
