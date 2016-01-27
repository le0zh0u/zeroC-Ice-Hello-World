package com.example.servant;

import Ice.Current;
import com.example.myHelloWorld._HelloWorldDisp;

/**
 * Created by zhouchunjie on 16/1/27.
 */
public class HelloWorldI extends _HelloWorldDisp {
    private static final long serialVersionUID = 1L;

    public void say(String s, Current __current) {
        System.out.println("Hello World!" + " the string s is " + s);
    }
}
