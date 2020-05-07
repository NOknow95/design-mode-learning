package com.jw.mode.learning.builder;

import java.util.List;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/07
 * @description
 */
public class DefaultDirector extends Director {

  public DefaultDirector(ArticleBuilder builder) {
    super(builder);
  }

  @Override
  public String buildArticle(String title, List<String> list, String paragraph) {
    return builder.setTitle(title).appendParagraph(paragraph).appendList(list).build();
  }
}
