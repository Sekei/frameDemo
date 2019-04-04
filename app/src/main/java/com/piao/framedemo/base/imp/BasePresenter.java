package com.piao.framedemo.base.imp;

import android.support.annotation.NonNull;

import com.piao.framedemo.base.BaseXPresenter;
import com.piao.framedemo.common.api.HttpFailure;
import com.piao.framedemo.common.api.HttpResponseListener;

/**
 * Created by admin on 2019/3/29.
 * Presenter 的实现
 */

public class BasePresenter<V extends IBaseView, T> extends BaseXPresenter<V> implements IBasePresenter, HttpResponseListener<T> {


    public BasePresenter(@NonNull V view) {
        super(view);
    }

    @Override
    public void onSuccess(Object tag, T t) {

    }

    @Override
    public void cancel(Object tag) {

    }

    @Override
    public void cancelAll() {

    }

    @Override
    public void onFailure(Object tag, HttpFailure failure) {

    }
}
