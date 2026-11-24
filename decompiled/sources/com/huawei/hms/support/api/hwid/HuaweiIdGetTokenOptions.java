package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HuaweiIdGetTokenOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45980a;
    private boolean b;

    public HuaweiIdGetTokenOptions(String str, boolean z) {
        this.f45980a = str;
        this.b = z;
    }

    public static HuaweiIdGetTokenOptions fromJsonObject(JSONObject jSONObject) {
        return new HuaweiIdGetTokenOptions(jSONObject.optString("accountName"), jSONObject.optBoolean("fromGetToken", false));
    }

    public String getAccountName() {
        return this.f45980a;
    }

    public boolean isFromGetToken() {
        return this.b;
    }

    public void setAccountName(String str) {
        this.f45980a = str;
    }

    public void setFromGetToken(boolean z) {
        this.b = z;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f45980a)) {
            jSONObject.put("accountName", this.f45980a);
        }
        jSONObject.put("fromGetToken", this.b);
        return jSONObject;
    }
}
