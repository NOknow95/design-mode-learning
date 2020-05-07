package com.jw.mode.learning.factory.abstractfactory;

import com.jw.mode.learning.factory.simple.Shape;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class Square implements Shape {

  @Override
  public void draw() {
    System.out.println("draw square.");
  }
}
