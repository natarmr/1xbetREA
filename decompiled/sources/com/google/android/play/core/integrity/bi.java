package com.google.android.play.core.integrity;

import a.z6w0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
class bi extends z6w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f45618a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.f45618a = taskCompletionSource;
    }

    @Override // a.z6w0
    public final void b(Bundle bundle) {
        this.b.f45620a.d(this.f45618a);
    }

    @Override // a.z6w0
    public void c(Bundle bundle) {
        this.b.f45620a.d(this.f45618a);
    }

    @Override // a.z6w0
    public final void d(Bundle bundle) {
        this.b.f45620a.d(this.f45618a);
    }

    @Override // a.z6w0
    public void e(Bundle bundle) {
        this.b.f45620a.d(this.f45618a);
    }
}
