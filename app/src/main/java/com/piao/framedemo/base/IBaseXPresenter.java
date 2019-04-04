package com.piao.framedemo.base;

/**
 * Created by admin on 2019/3/29.
 * Presenter层的接口基类
 */

public interface IBaseXPresenter {

    /**
     * 判断presenter 与 view 是否建立联系
     * 防止出现内存泄露的情况
     *
     * @return true: 联系已建立 false: 联系已断开
     */
    boolean isViewAttach();


    /**
     * 断开 presenter 与 view 的直接联系
     */
    void detachView();
}
