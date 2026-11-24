package com.huawei.hms.hatool;

import a.jwn;
import a.s60;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class o0 {
    private static o0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45877a;
    private String b;

    private String a(String str) {
        String strE = f() ? s60.e("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        v.c("hmsSdk", "deCrypt work key first");
        String strA = n.a(str, e());
        if (!TextUtils.isEmpty(strA)) {
            if (f()) {
                c(b(strA));
                x.c();
            }
            return strA;
        }
        String strC = jwn.c(16);
        c(b(strC));
        if (f()) {
            x.c();
        }
        return strC;
    }

    private String b(String str) {
        return f() ? s60.g("analytics_keystore", str) : n.b(str, e());
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static o0 d() {
        if (c == null) {
            g();
        }
        return c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private boolean f() {
        return true;
    }

    private static synchronized void g() {
        if (c == null) {
            c = new o0();
        }
    }

    private String c() {
        String strA = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strA)) {
            return a(strA);
        }
        String strC = jwn.c(16);
        c(b(strC));
        return strC;
    }

    public String a() {
        if (TextUtils.isEmpty(this.f45877a)) {
            this.f45877a = c();
        }
        return this.f45877a;
    }

    public void b() {
        String strC = jwn.c(16);
        if (c(b(strC))) {
            this.f45877a = strC;
        }
    }
}
