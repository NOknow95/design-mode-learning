package com.jw.mode.learning.factory.method;

import com.jw.mode.learning.factory.simple.Shape;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class Client {

  private static final AbstractShapeFactory lineFactory = new LineFactory();
  private static final AbstractShapeFactory circleFactory = new CircleFactory();

  public static void main(String[] args) {

    Shape line = lineFactory.createShape();
    Shape circle = circleFactory.createShape();

    line.draw();
    circle.draw();
  }
}
