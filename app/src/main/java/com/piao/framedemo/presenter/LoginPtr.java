package com.piao.framedemo.presenter;

import android.support.annotation.NonNull;

import com.piao.framedemo.base.imp.BasePresenter;
import com.piao.framedemo.bean.LoginBean;
import com.piao.framedemo.common.api.HttpFailure;
import com.piao.framedemo.common.api.HttpResponseListener;
import com.piao.framedemo.contract.LoginContract;
import com.piao.framedemo.model.LoginModel;

/**
 * Created by admin on 2019/3/29.
 */

public class LoginPtr extends BasePresenter<LoginContract.LoginUI,LoginBean> implements LoginContract.LoginPtr,HttpResponseListener<LoginBean>{

    private LoginContract.LoginMdl mLoginMdl;

    public LoginPtr(@NonNull LoginContract.LoginUI view) {
        super(view);
        // 实例化 Model 层
        mLoginMdl=new LoginModel();
    }

    @Override
    public void login(String username, String password) {
        //显示进度条
        getView().showLoading();
        mLoginMdl.login(username,password,this);
    }

    @Override
    public void onSuccess(Object tag, LoginBean t) {
        // 先判断是否已经与 View 建立联系
        if (isViewAttach()) {
            // 隐藏进度条
            getView().hideLoading();
            // 登录成功调用
            getView().loginSuccess();
        }
    }

    @Override
    public void onFailure(Object tag, HttpFailure failure) {
        if (isViewAttach()) {
            // 隐藏进度条
            getView().hideLoading();
            // 登录失败调用
            getView().loginFailure();
        }
    }
}
