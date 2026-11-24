package com.google.android.play.core.integrity;

import a.i5w0;
import a.m8w0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
abstract class bm extends m8w0 {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // a.m8w0
    public final void a(Exception exc) {
        if (!(exc instanceof i5w0)) {
            super.a(exc);
        } else if (bn.k(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
