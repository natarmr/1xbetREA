package com.appsflyer.internal;

import a.e0g0;
import a.g0g0;
import a.iun;
import a.j0g0;
import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1gSDK {
    public AFi1zSDK AFKeystoreWrapper;
    public ExceptionManagerConfiguration d;
    public AFh1cSDK unregisterClient;

    public AFh1gSDK(JSONObject jSONObject) {
        jSONObject.getClass();
        this.unregisterClient = d(jSONObject);
        this.d = unregisterClient(jSONObject);
        this.AFKeystoreWrapper = registerClient(jSONObject);
    }

    private static AFh1cSDK d(JSONObject jSONObject) {
        Object g0g0Var;
        List arrayList;
        try {
            e0g0 e0g0Var = j0g0.b;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "r_debugger");
            if (jSONObjectUnregisterClient != null) {
                long j = jSONObjectUnregisterClient.getLong("ttl");
                int i = jSONObjectUnregisterClient.getInt("counter");
                String strOptString = jSONObjectUnregisterClient.optString("app_ver", "");
                String strOptString2 = jSONObjectUnregisterClient.optString(HiAnalyticsConstant.BI_KEY_SDK_VER, "");
                float fOptDouble = (float) jSONObjectUnregisterClient.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectUnregisterClient.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        string.getClass();
                        arrayList.add(string);
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                List list = arrayList;
                strOptString.getClass();
                strOptString2.getClass();
                g0g0Var = new AFh1cSDK(j, fOptDouble, list, i, strOptString, strOptString2);
            } else {
                g0g0Var = null;
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        e0g0 e0g0Var3 = j0g0.b;
        return (AFh1cSDK) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }

    private static AFi1zSDK registerClient(JSONObject jSONObject) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "meta_data");
            g0g0Var = jSONObjectUnregisterClient != null ? new AFi1zSDK(jSONObjectUnregisterClient.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return (AFi1zSDK) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }

    private static ExceptionManagerConfiguration unregisterClient(JSONObject jSONObject) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "exc_mngr");
            if (jSONObjectUnregisterClient != null) {
                String string = jSONObjectUnregisterClient.getString(HiAnalyticsConstant.BI_KEY_SDK_VER);
                int iOptInt = jSONObjectUnregisterClient.optInt("min", -1);
                int iOptInt2 = jSONObjectUnregisterClient.optInt("expire", -1);
                long jOptLong = jSONObjectUnregisterClient.optLong("ttl", -1L);
                string.getClass();
                g0g0Var = new ExceptionManagerConfiguration(string, iOptInt, iOptInt2, jOptLong);
            } else {
                g0g0Var = null;
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return (ExceptionManagerConfiguration) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1gSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.d(this.d, aFh1gSDK.d) && Intrinsics.d(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.d(this.unregisterClient, aFh1gSDK.unregisterClient);
    }

    public final int hashCode() {
        ExceptionManagerConfiguration exceptionManagerConfiguration = this.d;
        int iHashCode = (exceptionManagerConfiguration != null ? exceptionManagerConfiguration.hashCode() : 0) * 31;
        AFi1zSDK aFi1zSDK = this.AFKeystoreWrapper;
        int iHashCode2 = (iHashCode + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0)) * 31;
        AFh1cSDK aFh1cSDK = this.unregisterClient;
        return iHashCode2 + (aFh1cSDK != null ? aFh1cSDK.hashCode() : 0);
    }

    private static JSONObject unregisterClient(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(RemoteMessageConst.DATA)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
