package com.huawei.hms.framework.network.grs.local.model;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45845a;
    private Map<String, String> b;

    public Map<String, String> a() {
        return this.b;
    }

    public String b() {
        return this.f45845a;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countryGroup", this.f45845a);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.b.keySet()) {
            jSONObject2.put(str, this.b.get(str));
        }
        jSONObject.put("addresses", jSONObject2);
        return jSONObject;
    }

    public void a(String str) {
        this.f45845a = str;
    }

    public void a(Map<String, String> map) {
        this.b = map;
    }
}
