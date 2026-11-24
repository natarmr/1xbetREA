package com.huawei.hms.hwid;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s extends am {
    public s a(JSONObject jSONObject) {
        this.f45897a = jSONObject.optString("appId", null);
        this.b = jSONObject.optString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, null);
        this.c = jSONObject.optLong("hmsSdkVersion");
        this.d = jSONObject.optString("subAppId", null);
        return this;
    }

    public static s a(String str) {
        return new s().a(new JSONObject(str));
    }
}
