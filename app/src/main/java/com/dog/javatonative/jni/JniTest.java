package com.dog.javatonative.jni;

/**
 * Created by qiandong on 15/12/28.
 */
public class JniTest {

    public native void fooVoidJni();

    public native String fooStringJni();

    public native String fooStringJni(String str);
}
