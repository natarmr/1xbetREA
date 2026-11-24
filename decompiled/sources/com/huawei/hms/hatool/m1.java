package com.huawei.hms.hatool;

import a.jwn;

/* JADX INFO: loaded from: classes2.dex */
public class m1 {
    private static m1 b = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f45873a = new a();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45874a;
        String b;
        long c = 0;

        public a() {
        }

        public void a(long j) {
            m1.this.f45873a.c = j;
        }

        public void b(String str) {
            m1.this.f45873a.f45874a = str;
        }

        public void a(String str) {
            m1.this.f45873a.b = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public void a(String str, String str2) {
        long jB = b();
        String strC = w0.c(str, str2);
        if (strC == null || strC.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jB == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strC2 = jwn.c(16);
            String strA = h0.a(strC, strC2);
            this.f45873a.a(jCurrentTimeMillis);
            this.f45873a.b(strC2);
            this.f45873a.a(strA);
            return;
        }
        if (System.currentTimeMillis() - jB > 43200000) {
            String strC3 = jwn.c(16);
            String strA2 = h0.a(strC, strC3);
            this.f45873a.a(jB);
            this.f45873a.b(strC3);
            this.f45873a.a(strA2);
        }
    }

    public long b() {
        return this.f45873a.c;
    }

    public String c() {
        return this.f45873a.f45874a;
    }

    public String a() {
        return this.f45873a.b;
    }
}
