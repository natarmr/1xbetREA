package com.huawei.hms.hatool;

/* JADX INFO: loaded from: classes2.dex */
public class j1 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45866a;
    private String b;

    public j1(String str, String str2) {
        this.f45866a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        w0.b(this.f45866a, this.b);
    }
}
