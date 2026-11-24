package com.huawei.hms.hwid;

import a.jf4;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class r {
    public static void a(String str) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            return;
        }
        jf4.n(str);
    }

    public static void a() {
        a("Must not be called on the main application thread");
    }
}
