package com.jw.mode.learning.factory.method;

import com.jw.mode.learning.factory.simple.Line;
import com.jw.mode.learning.factory.simple.Shape;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class LineFactory extends AbstractShapeFactory {

  @Override
  public Shape createShape() {
    return new Line();
  }
}
