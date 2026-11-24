package com.huawei.hms.hatool;

import a.o050;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    private static j b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45863a;

    public static class a extends e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45864a;
        String b;

        public a(String str, String str2) {
            this.f45864a = str;
            this.b = str2;
        }

        @Override // com.huawei.hms.hatool.e0
        public String a() {
            return z.d(this.f45864a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String b() {
            return z.g(this.f45864a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String c() {
            return z.j(this.f45864a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public int d() {
            return (z.h(this.f45864a, this.b) ? 1 : 0) | (z.k(this.f45864a, this.b) ? 4 : 0) | (z.e(this.f45864a, this.b) ? 2 : 0);
        }

        @Override // com.huawei.hms.hatool.e0
        public String a(String str) {
            return o050.V(str);
        }
    }

    public String a(boolean z) {
        if (!z) {
            return "";
        }
        String strE = q0.e();
        if (TextUtils.isEmpty(strE)) {
            strE = d.a(this.f45863a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(strE)) {
                strE = UUID.randomUUID().toString().replace("-", "");
                d.b(this.f45863a, "global_v2", "uuid", strE);
            }
            q0.h(strE);
        }
        return strE;
    }

    public String b(String str, String str2) {
        return i0.b(this.f45863a, str, str2);
    }

    public i c(String str, String str2) {
        return new a(str, str2).a(this.f45863a);
    }

    public String d(String str, String str2) {
        return f1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (!z.f(str, str2)) {
            return new Pair<>("", "");
        }
        String strP = s.c().b().p();
        String strQ = s.c().b().q();
        if (!TextUtils.isEmpty(strP) && !TextUtils.isEmpty(strQ)) {
            return new Pair<>(strP, strQ);
        }
        Pair<String, String> pairE = x0.e(this.f45863a);
        s.c().b().k((String) pairE.first);
        s.c().b().l((String) pairE.second);
        return pairE;
    }

    public String f(String str, String str2) {
        return f1.a(str, str2);
    }

    public String a(String str, String str2) {
        return i0.a(this.f45863a, str, str2);
    }

    public static j a() {
        j jVar;
        synchronized (j.class) {
            try {
                jVar = b;
                if (jVar == null) {
                    jVar = new j();
                    b = jVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public void a(Context context) {
        if (this.f45863a == null) {
            this.f45863a = context;
        }
    }
}
