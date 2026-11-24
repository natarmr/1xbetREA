package com.huawei.hms.hwid;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45895a;

    public af(String str) {
        this.f45895a = str;
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, this.f45895a);
            return jSONObject.toString();
        } catch (JSONException unused) {
            as.d("ReadSmsInputBean", "toJson failed", true);
            return null;
        }
    }

    public af() {
    }
}
