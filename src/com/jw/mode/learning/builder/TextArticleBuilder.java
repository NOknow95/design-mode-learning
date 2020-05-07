package com.jw.mode.learning.builder;

import java.util.List;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/07
 * @description
 */
public class TextArticleBuilder extends ArticleBuilder {

  @Override
  public ArticleBuilder setTitle(String title) {
    getResult()
        .append("===============================================\n")
        .append("============         ").append(title).append("         ============\n")
        .append("===============================================\n");
    return this;
  }

  @Override
  public ArticleBuilder appendList(List<String> list) {
    for (String item : list) {
      getResult().append("* ").append(item).append("\n");
    }
    return this;
  }

  @Override
  public ArticleBuilder appendParagraph(String paragraph) {
    getResult().append(paragraph).append("\n");
    return this;
  }

  @Override
  public String build() {
    return getResult().toString();
  }
}
