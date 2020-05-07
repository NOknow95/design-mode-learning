package com.jw.mode.learning.builder;

import java.util.List;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/07
 * @description
 */
public class HtmlArticleBuilder extends ArticleBuilder {

  @Override
  public ArticleBuilder setTitle(String title) {
    getResult()
        .append("<html><header>")
        .append("<title>")
        .append(title)
        .append("</title>")
        .append("</header><body>");
    return this;
  }

  @Override
  public ArticleBuilder appendList(List<String> list) {
    getResult().append("<ul>");
    for (String item : list) {
      getResult().append("<li>").append(item).append("</li>");
    }
    getResult().append("</ul>");
    return this;
  }

  @Override
  public ArticleBuilder appendParagraph(String paragraph) {
    getResult().append("<p>").append(paragraph).append("</p>");
    return this;
  }

  @Override
  public String build() {
    return getResult().append("</body></html>").toString();
  }
}
