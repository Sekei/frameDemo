package com.piao.framedemo.base.imp;

import android.database.Observable;
import android.support.annotation.NonNull;

import com.piao.framedemo.common.api.HttpResponseListener;

/**
 * Created by admin on 2019/3/29.
 */

public class BaseModel {
    /**
     * 发送网络请求
     *
     * @param observable
     * @param callback
     * @param <T>
     */
    protected <T> void sendRequest(@NonNull Observable<T> observable, HttpResponseListener<T> callback) {
    }

    /**
     * 发送网络请求
     *
     * @param tag
     * @param observable
     * @param callback
     * @param <T>
     */
    private <T> void sendRequest(@NonNull Object tag, @NonNull Observable<T> observable, HttpResponseListener callback) {
    }

    /**
     * 发送网络请求
     *
     * @param observable 被观察者
     * @param observer   观察者
     * @param <T>
     */
//    protected <T> void sendRequest(@NonNull Observable<T> observable, @NonNull HttpObserver<T> observer) {
//    }

    /**
     * 发送网络请求
     *
     * @param tag        请求标记
     * @param observable 被观察者
     * @param observer   观察者
     * @param <T>
     */
//    protected <T> void sendRequest(@NonNull Object tag, @NonNull Observable<T> observable, @NonNull HttpObserver<T> observer) {
//    }
}
