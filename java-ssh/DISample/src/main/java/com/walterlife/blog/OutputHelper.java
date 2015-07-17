/*************************************************************************
 *    File Name: OutputHelper.java
 * 
 *       Author: Shootao Shanghai,Inc.
 *         Mail: walter@shootao.com
 * Created Time: Thu 16 Jul 2015 06:09:07 PM CST
 * 
 *  Description: ...
 * 
 ************************************************************************
 */

package com.walterlife.blog;

import com.walterlife.blog.IOutputGenerator;

public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput() {
        outputGenerator.generateOutput();
    }

    OutputHelper(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    } 

    //public void setOutputGenerator(IOutputGenerator outputGenerator) {
        //this.outputGenerator = outputGenerator;
    //}
}
