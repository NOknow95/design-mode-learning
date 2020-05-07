package com.jw.mode.learning.factory.abstractfactory;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class Sphere extends Geometry {

  @Override
  public void create() {
    System.out.println("Sphere created.");
  }
}
