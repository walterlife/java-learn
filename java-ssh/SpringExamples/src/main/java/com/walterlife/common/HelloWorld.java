/*************************************************************************
 *    File Name: java/com/walterlife/common/HelloWorld.java
 * 
 *       Author: Shootao Shanghai,Inc.
 *         Mail: walter@shootao.com
 * Created Time: Thu 16 Jul 2015 04:10:32 PM CST
 * 
 *  Description: ...
 * 
 ************************************************************************
*/
package com.walterlife.common;

public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    } 

    public void printHello() {
        System.out.println("Hello!" + this.name);
    } 
} 


