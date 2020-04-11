package com.jw.mode.learning.composite;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/11
 * @description
 */
public class Main {

  public static void main(String[] args) {
    OrganizationComponent university = new University("福建师范大学", "在福州市");
    OrganizationComponent college1 = new College("光电与信息工程学院", "简称光电");
    OrganizationComponent college2 = new College("物理与能源学院", "简称物能");

    university.add(college1);
    university.add(college2);

    OrganizationComponent major11 = new Major("通信工程", "");
    OrganizationComponent major12 = new Major("电子信息工程", "");
    OrganizationComponent major13 = new Major("网络工程", "");
    OrganizationComponent major21 = new Major("物理实验", "");
    OrganizationComponent major22 = new Major("能源实验", "");

    college1.add(major11);
    college1.add(major12);
    college1.add(major13);

    college2.add(major21);
    college2.add(major22);

    university.print();
  }

}
