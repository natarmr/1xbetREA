package com.google.android.recaptcha.internal;

import a.jzj;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class zzas {
    public static final Task zza(jzj jzjVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        jzjVar.invokeOnCompletion(new zzar(taskCompletionSource, jzjVar));
        return taskCompletionSource.getTask();
    }
}
