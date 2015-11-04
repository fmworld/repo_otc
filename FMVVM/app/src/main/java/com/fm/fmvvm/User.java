package com.fm.fmvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by zhoufeng'an on 2015/9/1.
 */
public class User extends BaseObservable {
    private String name;
    private String password;
    private boolean visiable;
    @Bindable
    public String getName() {
        return name;
    }
    @Bindable
    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.fm.fmvvm.BR.name);
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(com.fm.fmvvm.BR.password);
    }

    public boolean isVisiable() {
        return visiable;
    }

    public void setVisiable(boolean visiable) {
        this.visiable = visiable;
    }
}
