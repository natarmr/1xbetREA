package com.huawei.hms.support.api.account;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AccountGetTokenOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45971a;
    private boolean b;

    public AccountGetTokenOptions(String str, boolean z) {
        this.f45971a = str;
        this.b = z;
    }

    public static AccountGetTokenOptions fromJsonObject(JSONObject jSONObject) {
        return new AccountGetTokenOptions(jSONObject.optString("accountName"), jSONObject.optBoolean("fromGetToken", false));
    }

    public String getAccountName() {
        return this.f45971a;
    }

    public boolean isFromGetToken() {
        return this.b;
    }

    public void setAccountName(String str) {
        this.f45971a = str;
    }

    public void setFromGetToken(boolean z) {
        this.b = z;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f45971a)) {
            jSONObject.put("accountName", this.f45971a);
        }
        jSONObject.put("fromGetToken", this.b);
        return jSONObject;
    }
}
