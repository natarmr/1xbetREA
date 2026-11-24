package com.huawei.hms.aaid.plugin;

import a.duo0;
import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface PushProxy {
    void deleteAllToken(Context context);

    void deleteToken(Context context, String str, String str2);

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2);

    duo0 subscribe(Context context, String str, String str2);

    duo0 turnOff(Context context, String str);

    duo0 turnOn(Context context, String str);

    duo0 unsubscribe(Context context, String str, String str2);
}
