package com.huawei.hms.framework.network.grs.local.model;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45843a;
    private String b;
    private Set<String> c;
    private String d;

    public Set<String> a() {
        return this.c;
    }

    public String b() {
        return this.f45843a;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ParameterNames.ID, this.f45843a);
        jSONObject.put("name", this.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("countries", jSONArray);
        jSONObject.put("description", this.d);
        return jSONObject;
    }

    public void a(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.f45843a = str;
    }

    public void c(String str) {
        this.b = str;
    }

    public void a(Set<String> set) {
        this.c = set;
    }
}
