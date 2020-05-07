package com.jw.mode.learning.delete.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/05/06
 * @description
 */
public class Test1 {

  private static Pattern pattern = Pattern.compile("<![^\\-]+->");

  public static void main(String[] args) {
    Matcher matcher = pattern.matcher(ConstTest.html);
    StringBuffer sb = new StringBuffer();
    while (matcher.find()) {
      String group = matcher.group();
      System.out.println("group = " + group);
      matcher.appendReplacement(sb, group.substring(0, group.lastIndexOf("->")).concat("-->"));
    }
    matcher.appendTail(sb);
    System.out.println("--------------------");
    System.out.println(sb.toString());
  }

}
