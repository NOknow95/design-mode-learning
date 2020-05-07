package com.jw.mode.learning.factory.simple;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class ShapeFactory {

  public static Shape createShape(String shapeType) {
    if ("line".equalsIgnoreCase(shapeType)) {
      return new Line();
    } else if ("circle".equalsIgnoreCase(shapeType)) {
      return new Circle();
    } else {
      throw new IllegalArgumentException("wrong shape type.");
    }
  }

}
