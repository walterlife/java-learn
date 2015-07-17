/*************************************************************************
 *    File Name: src/main/java/com/walterlife/blog/HelloWorld.java
 * 
 *       Author: Shootao Shanghai,Inc.
 *         Mail: walter@shootao.com
 * Created Time: Thu 16 Jul 2015 04:41:42 PM CST
 * 
 *  Description: ...
 * 
 ************************************************************************
 */
package com.walterlife.blog;

public class HelloWorld  {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}
