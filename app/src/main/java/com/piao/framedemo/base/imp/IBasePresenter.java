package com.piao.framedemo.base.imp;

import com.piao.framedemo.base.IBaseXPresenter;

/**
 * Created by admin on 2019/3/29.
 * Presenter 接口
 */

public interface IBasePresenter extends IBaseXPresenter {

    /**
     * 取消网络请求
     *
     * @param tag 网络请求标记
     */
    void cancel(Object tag);


    /**
     * 取消所有网络请求
     */
    void cancelAll();
}
