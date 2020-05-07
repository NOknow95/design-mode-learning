package com.jw.mode.learning.factory.abstractfactory;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public abstract class Geometry {

  public Geometry() {
    create();
  }

  public abstract void create();
}
