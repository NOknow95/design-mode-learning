package com.jw.mode.learning.composite;

import java.util.Objects;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/11
 * @description
 */
public abstract class OrganizationComponent {

  private String name;
  private String desc;

  public OrganizationComponent(String name, String desc) {
    this.name = name;
    this.desc = desc;
  }

  public String getName() {
    return name;
  }

  public String getDesc() {
    return desc;
  }

  public void add(OrganizationComponent component) {
    throw new UnsupportedOperationException();
  }

  public void remove(OrganizationComponent component) {
    throw new UnsupportedOperationException();
  }

  public abstract void print();

  @Override
  public String toString() {
    return getName() + ":" + getDesc();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationComponent that = (OrganizationComponent) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(desc, that.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc);
  }
}
