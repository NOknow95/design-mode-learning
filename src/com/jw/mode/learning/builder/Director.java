package com.jw.mode.learning.builder;

import java.util.List;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/07
 * @description
 */
public abstract class Director {

  protected ArticleBuilder builder;

  public Director(ArticleBuilder builder) {
    this.builder = builder;
  }

  public abstract String buildArticle(String title, List<String> list, String paragraph);
}
