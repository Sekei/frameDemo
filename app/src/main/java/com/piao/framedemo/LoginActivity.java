package com.piao.framedemo;

import android.os.Bundle;
import android.util.Log;

import com.piao.framedemo.base.imp.BaseActivity;
import com.piao.framedemo.contract.LoginContract;
import com.piao.framedemo.presenter.LoginPtr;

public class LoginActivity extends BaseActivity<LoginContract.LoginPtr> implements LoginContract.LoginUI {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPresenter().login("admin", "123456");
    }

    @Override
    public LoginContract.LoginPtr onBindPresenter() {
        return new LoginPtr(this);
    }


    @Override
    public void loginSuccess() {
        Log.d("TAG", "登录成功");
    }

    @Override
    public void loginFailure() {
        Log.d("TAG", "登录失败");
    }
}
