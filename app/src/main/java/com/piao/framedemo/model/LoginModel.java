package com.piao.framedemo.model;

import android.util.Log;

import com.piao.framedemo.base.imp.BaseModel;
import com.piao.framedemo.common.api.HttpResponseListener;
import com.piao.framedemo.contract.LoginContract;

/**
 * Created by admin on 2019/3/29.
 */

public class LoginModel extends BaseModel implements LoginContract.LoginMdl {
    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @param callbak  网络请求回调
     */
    @Override
    public void login(String username, String password, HttpResponseListener callbak) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("username", username);
//        map.put("password", Md5Util.encrypt(password));
//        RequestBody body = ReqBodyHelper.createJson(map);
//        // 发送网络请求
//        sendRequest(HttpUtils.getApi().getLoginInfo(body),callbak);
        //callbak.onSuccess("tag","");
        Log.d("TAG", "msg" + callbak.);
    }
}
