package com.piao.framedemo.base;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;

/**
 * Created by admin on 2019/3/29.
 * Presenter 中的基类实现
 */

public abstract class BaseXPresenter<V extends IBaseXView> implements IBaseXPresenter {
    //防止 activity 不走 onDestory() 方法，所以采用弱引用来防止内存泄漏
    private WeakReference<V> mViewRef;

    public BaseXPresenter(@NonNull V view) {
        attachView(view);
    }


    private void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
    }

    public V getView() {
        return mViewRef.get();
    }

    @Override
    public boolean isViewAttach() {
        return null != mViewRef && null != mViewRef.get();
    }

    @Override
    public void detachView() {
        if (null != mViewRef) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
