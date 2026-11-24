package com.huawei.hms.support.api.entity.account;

import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AccountStartAssistLoginRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45974a;

    public AccountStartAssistLoginRequest(String str) {
        this.f45974a = str;
    }

    public static AccountStartAssistLoginRequest fromJson(String str) {
        if (str == null) {
            return null;
        }
        return new AccountStartAssistLoginRequest().objectFromJson(new JSONObject(str));
    }

    public AccountStartAssistLoginRequest objectFromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f45974a = jSONObject.getString(CommonConstant.KEY_ASSIST_TOKEN);
        }
        return this;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f45974a;
        if (str != null) {
            jSONObject.put(CommonConstant.KEY_ASSIST_TOKEN, str);
        }
        return jSONObject.toString();
    }

    public AccountStartAssistLoginRequest() {
    }
}
