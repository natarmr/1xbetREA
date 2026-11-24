package com.huawei.hms.support.account.result;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.AbstractAuthResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GetAssistTokenResult extends AbstractAuthResult {
    private String assistToken;

    public GetAssistTokenResult fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        JSONObject jSONObject = new JSONObject(str);
        this.assistToken = jSONObject.getString(CommonConstant.KEY_ASSIST_TOKEN);
        jsonToSuper(jSONObject);
        return this;
    }

    public String getAssistToken() {
        return this.assistToken;
    }
}
