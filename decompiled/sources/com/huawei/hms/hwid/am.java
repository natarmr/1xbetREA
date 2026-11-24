package com.huawei.hms.hwid;

import a.axq;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f45897a;
    protected String b;
    protected long c;
    protected String d;

    public String a() {
        return this.f45897a;
    }

    public void b(String str) {
        this.f45897a = str;
    }

    public void c(String str) {
        this.b = str;
    }

    public String d() {
        return e().toString();
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("appId", this.f45897a);
        jSONObject.putOpt(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, this.b);
        jSONObject.put("hmsSdkVersion", this.c);
        jSONObject.putOpt("subAppId", this.d);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HuaweiIdCpClientInfo{appId='");
        sb.append(this.f45897a);
        sb.append("', packageName='");
        sb.append(this.b);
        sb.append("', hmsSdkVersion=");
        sb.append(this.c);
        sb.append("', subAppId=");
        return axq.m(sb, this.d, '}');
    }

    public void a(long j) {
        this.c = j;
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }
}
