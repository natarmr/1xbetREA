package com.huawei.hms.hwid;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b extends am {
    public b a(JSONObject jSONObject) {
        this.f45897a = jSONObject.optString("appId", null);
        this.b = jSONObject.optString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, null);
        this.c = jSONObject.optLong("hmsSdkVersion");
        this.d = jSONObject.optString("subAppId", null);
        return this;
    }

    public static b a(String str) {
        return new b().a(new JSONObject(str));
    }
}
