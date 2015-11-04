package com.fm.fmvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fm.fmvvm.databinding.ActivityLoginBinding;

/**
 * Created by zhoufeng'an on 2015/9/2.
 */
public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = TestApplication.instance().user;
        user.setName("aaa");
        user.setPassword("aaaaaaa");
        user.setVisiable(true);
//        binding.setUser();
    }
}
