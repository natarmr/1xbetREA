package com.huawei.hms.activity.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class BusResponseResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f45704a;
    private int b;

    public int getCode() {
        return this.b;
    }

    public Intent getIntent() {
        return this.f45704a;
    }

    public void setCode(int i) {
        this.b = i;
    }

    public void setIntent(Intent intent) {
        this.f45704a = intent;
    }
}
