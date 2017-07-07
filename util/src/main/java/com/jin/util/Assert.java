package com.jin.util;

/**
 * @author wu.jinqing
 * @date 2017年07月06日
 */
public class Assert {
    public static boolean notEmpty(String arg)
    {

        return arg != null && !"".equals(arg.trim());
    }
}
