package com.google.android.play.core.integrity;

import a.h8w0;
import a.qa3;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final h8w0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new h8w0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, a.z6w0
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        qa3 qa3VarA = this.c.f.a(bundle);
        TaskCompletionSource taskCompletionSource = this.f45618a;
        if (qa3VarA != null) {
            taskCompletionSource.trySetException(qa3VarA);
        } else {
            taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
