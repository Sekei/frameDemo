package com.piao.framedemo.base;

import android.app.Activity;

/**
 * Created by admin on 2019/3/29.
 * View层的接口基类
 */

public interface IBaseXView {

    /**
     * 获取 activity 对象
     * 主要用于在Presenter中需要使用Context对象时调用，
     * 不直接在Presenter中创建Context对象，最大程度的防止内存泄漏
     *
     * @param <T>
     * @return Context对象
     */
    <T extends Activity> T getSelfActivity();
}
