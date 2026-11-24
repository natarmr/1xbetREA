package com.google.android.gms.tasks;

import a.fbw0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzu implements Executor {
    private final Handler zza = new fbw0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
