package com.google.android.play.core.integrity;

import a.h8w0;
import a.qa3;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final h8w0 d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new h8w0("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, a.z6w0
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.d.b("onRequestExpressIntegrityToken", new Object[0]);
        qa3 qa3VarA = this.c.f.a(bundle);
        if (qa3VarA != null) {
            this.f45618a.trySetException(qa3VarA);
            return;
        }
        bj bjVar = new bj(this, this.c.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f45618a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
