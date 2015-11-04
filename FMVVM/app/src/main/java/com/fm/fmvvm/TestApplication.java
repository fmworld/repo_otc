package com.fm.fmvvm;

import android.app.Application;

import com.fm.fmvvm.User;

/**
 * Created by zhoufeng'an on 2015/9/2.
 */
public class TestApplication extends Application {
    private static TestApplication instance;

    public static TestApplication instance(){
        if(null == instance){
            instance = new TestApplication();
        }
        return instance;
    }
    public User user;
    public TestApplication(){
        user = new User();
    }
}
