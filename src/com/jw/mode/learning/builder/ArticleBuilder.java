package com.jw.mode.learning.builder;

import java.util.List;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/07
 * @description
 */
public abstract class ArticleBuilder {

  private StringBuilder result;

  public ArticleBuilder() {
    this.result = new StringBuilder(50);
  }

  public ArticleBuilder setTitle(String title) {
    return this;
  }

  public ArticleBuilder appendList(List<String> list) {
    return this;
  }

  public ArticleBuilder appendParagraph(String paragraph) {
    return this;
  }

  public abstract String build();

  public StringBuilder getResult() {
    return result;
  }
}
