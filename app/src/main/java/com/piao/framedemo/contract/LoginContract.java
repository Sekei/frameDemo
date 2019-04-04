package com.piao.framedemo.contract;

import com.piao.framedemo.base.imp.IBasePresenter;
import com.piao.framedemo.base.imp.IBaseView;
import com.piao.framedemo.common.api.HttpResponseListener;

/**
 * Created by admin on 2019/3/29.
 * 登录契约类
 */

public class LoginContract {
    /**
     * view 层接口
     */
    public interface LoginUI extends IBaseView {
        /**
         * 登录成功
         */
        void loginSuccess();

        /**
         * 登录失败
         */
        void loginFailure();
    }

    /**
     * presenter 层接口
     */
    public interface LoginPtr extends IBasePresenter {
        void login(String username, String password);
    }

    /**
     * model 层接口
     */
    public interface LoginMdl {
        void login(String username, String password, HttpResponseListener callbak);
    }
}
