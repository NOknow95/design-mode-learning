package com.jw.mode.learning.factory.simple;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class Client {

  public static void main(String[] args) {
    Shape line = ShapeFactory.createShape("line");
    Shape circle = ShapeFactory.createShape("circle");

    line.draw();
    circle.draw();
  }
}
