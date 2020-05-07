package com.jw.mode.learning.factory.method;

import com.jw.mode.learning.factory.simple.Circle;
import com.jw.mode.learning.factory.simple.Shape;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class CircleFactory extends AbstractShapeFactory {

  @Override
  public Shape createShape() {
    return new Circle();
  }
}
