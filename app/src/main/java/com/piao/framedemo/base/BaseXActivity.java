package com.piao.framedemo.base;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by admin on 2019/3/29.
 * View 层的基类实现
 */

public abstract class BaseXActivity<P extends IBaseXPresenter> extends AppCompatActivity implements IBaseXView {

    private P mPresenter;

    /**
     * 创建 presenter
     *
     * @return
     */
    public abstract P onBindPresenter();


    /**
     * 获取presenter 对象，在需要的时候才创建'Presenter',起到懒加载作用
     *
     * @return
     */
    public P getPresenter() {
        if (null == mPresenter)
            mPresenter = onBindPresenter();
        return mPresenter;
    }

    @Override
    public Activity getSelfActivity() {
        return this;
    }


    /**
     * 在生命周期结束时，将presenter 与 view 之间的联系断开，防止出现内存泄露
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mPresenter)
            mPresenter.detachView();
    }
}
