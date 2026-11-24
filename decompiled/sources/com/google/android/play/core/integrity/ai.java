package com.google.android.play.core.integrity;

import a.h8w0;
import a.o7w0;
import a.qa3;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class ai extends o7w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f45596a;
    private final h8w0 b;
    private final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f45596a = ajVar;
        this.b = new h8w0("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    @Override // a.o7w0
    public final void b(Bundle bundle) {
        this.f45596a.f45597a.d(this.c);
        this.b.b("onRequestIntegrityToken", new Object[0]);
        qa3 qa3VarA = this.f45596a.e.a(bundle);
        if (qa3VarA != null) {
            this.c.trySetException(qa3VarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f45596a.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
