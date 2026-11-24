package com.huawei.hms.hwid;

/* JADX INFO: loaded from: classes2.dex */
public abstract class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f45898a = 13;
    protected String b;
    protected String c;

    public int a() {
        return this.f45898a;
    }

    @Deprecated
    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public void a(int i) {
        this.f45898a = i;
    }

    public void b(String str) {
        this.c = str;
    }

    @Deprecated
    public void a(String str) {
        this.b = str;
    }
}
