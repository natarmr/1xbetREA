package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45852a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.optString("event");
        this.c = n.a(jSONObject.optString("properties"), o0.d().a());
        this.f45852a = jSONObject.optString(Payload.TYPE);
        this.d = jSONObject.optString("eventtime");
        this.e = jSONObject.optString("event_session_name");
        this.f = jSONObject.optString("first_session_event");
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f45852a;
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObjectA = a();
        jSONObjectA.put("properties", n.b(this.c, o0.d().a()));
        return jSONObjectA;
    }

    public void e(String str) {
        this.f = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.f45852a = str;
    }

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Payload.TYPE, this.f45852a);
        jSONObject.put("eventtime", this.d);
        jSONObject.put("event", this.b);
        jSONObject.put("event_session_name", this.e);
        jSONObject.put("first_session_event", this.f);
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.c));
        return jSONObject;
    }
}
