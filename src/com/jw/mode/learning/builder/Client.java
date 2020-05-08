package com.jw.mode.learning.builder;

import java.util.Arrays;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/07
 * @description
 */
public class Client {

  public static void main(String[] args) {
    Director director = new DefaultDirector(new HtmlArticleBuilder());
    String article = director.buildArticle("title", Arrays.asList("11", "222"), "this is a test.");
    System.out.println(article);
    director = new DefaultDirector(new TextArticleBuilder());
    article = director.buildArticle("title", Arrays.asList("11", "222"), "this is a test.");
    System.out.println(article);
  }

}
