package com.huawei.hms.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f45896a;
    private String b;

    public static ag b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ag();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer numValueOf = jSONObject.has("errorCode") ? Integer.valueOf(jSONObject.getInt("errorCode")) : null;
            String string = jSONObject.has("errorMsg") ? jSONObject.getString("errorMsg") : null;
            ag agVar = new ag();
            agVar.a(numValueOf);
            agVar.a(string);
            return agVar;
        } catch (JSONException unused) {
            as.d("ReadSmsOutputBean", "ReadSmsOutputBean json parse falied", true);
            return new ag();
        }
    }

    public Integer a() {
        return this.f45896a;
    }

    public void a(Integer num) {
        this.f45896a = num;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.b;
    }
}
