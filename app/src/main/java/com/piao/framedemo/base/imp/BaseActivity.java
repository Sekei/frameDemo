package com.piao.framedemo.base.imp;

import android.util.Log;

import com.piao.framedemo.base.BaseXActivity;

/**
 * Created by admin on 2019/3/29.
 * View 的实现
 */

public abstract class BaseActivity<P extends IBasePresenter> extends BaseXActivity<P> implements IBaseView {
    //加载进度条

    @Override
    public void showLoading() {
        Log.d("TAG","显示进度条");
    }

    @Override
    public void hideLoading() {
        Log.d("TAG","关闭进度条");
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    protected void onDestroy() {
        hideLoading();
        super.onDestroy();
    }
}
