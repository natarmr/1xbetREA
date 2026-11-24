package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class StartAssistLoginResult extends Result {
    public StartAssistLoginResult fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        jsonToSuper(new JSONObject(str));
        return this;
    }

    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public void jsonToSuper(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CommonConstant.KEY_STATUS);
        if (jSONObjectOptJSONObject != null) {
            setStatus(new Status(jSONObjectOptJSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT), jSONObjectOptJSONObject.optString("statusMessage", null)));
        }
    }
}
