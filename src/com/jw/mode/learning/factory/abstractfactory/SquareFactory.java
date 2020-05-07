package com.jw.mode.learning.factory.abstractfactory;

import com.jw.mode.learning.factory.simple.Shape;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class SquareFactory extends AbstractFactory {

  @Override
  public Shape createShape() {
    return new Square();
  }

  @Override
  public Geometry createGeometry() {
    return new Cube();
  }
}
