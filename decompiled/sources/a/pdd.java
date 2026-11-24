package a;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class pdd extends CompletableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jf60 f26803a;

    public pdd(jf60 jf60Var) {
        this.f26803a = jf60Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f26803a.cancel();
        }
        return super.cancel(z);
    }
}
