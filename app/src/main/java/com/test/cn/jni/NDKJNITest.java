package com.test.cn.jni;

/**
 * Created by jinliang on 17-5-31.
 *  NDK 开发总结
 */

public class NDKJNITest {

    static {
        // 加载so 文件
        System.loadLibrary("NDKJNITest");
    }
    public native void getName(String name) ;

}
