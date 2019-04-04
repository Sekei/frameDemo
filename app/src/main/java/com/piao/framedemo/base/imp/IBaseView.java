package com.piao.framedemo.base.imp;

import com.piao.framedemo.base.IBaseXView;

/**
 * Created by admin on 2019/3/29.
 * view 接口
 */

public interface IBaseView extends IBaseXView {

    /**
     * 显示正在加载的view
     */
    void showLoading();

    /**
     * 关闭正在加载的view
     */
    void hideLoading();

    /**
     * 显示提示
     *
     * @param msg
     */
    void showToast(String msg);
}
