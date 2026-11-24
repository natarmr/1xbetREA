package com.huawei.hms.opendevice;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f45919a;

    public o(Runnable runnable) {
        this.f45919a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f45919a;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable unused) {
                Log.e("HmsPushThreads", "exception in task run");
            }
        }
    }
}
