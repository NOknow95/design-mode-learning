package com.jw.mode.learning.factory.abstractfactory;

import com.jw.mode.learning.factory.simple.Shape;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class Client {

  private static final AbstractFactory squareFactory = new SquareFactory();
  private static final AbstractFactory circleFactory = new CircleFactory();

  public static void main(String[] args) {

    Shape square = squareFactory.createShape();
    Shape circle = circleFactory.createShape();

    square.draw();
    circle.draw();

    Geometry cube = squareFactory.createGeometry();
    Geometry sphere = circleFactory.createGeometry();
  }
}
