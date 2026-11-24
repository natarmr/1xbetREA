package com.google.android.play.core.integrity;

import a.h5w0;
import a.m5w0;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m5w0 f45605a;
    private final m5w0 b;

    public at(m5w0 m5w0Var, m5w0 m5w0Var2) {
        this.f45605a = m5w0Var;
        this.b = m5w0Var2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, h5w0 h5w0Var) {
        Object objA = this.f45605a.a();
        objA.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        h5w0Var.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, h5w0Var);
    }
}
