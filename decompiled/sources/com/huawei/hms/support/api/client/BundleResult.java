package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class BundleResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45972a;
    private Bundle b;

    public BundleResult(int i, Bundle bundle) {
        this.f45972a = i;
        this.b = bundle;
    }

    public int getResultCode() {
        return this.f45972a;
    }

    public Bundle getRspBody() {
        return this.b;
    }

    public void setResultCode(int i) {
        this.f45972a = i;
    }

    public void setRspBody(Bundle bundle) {
        this.b = bundle;
    }
}
